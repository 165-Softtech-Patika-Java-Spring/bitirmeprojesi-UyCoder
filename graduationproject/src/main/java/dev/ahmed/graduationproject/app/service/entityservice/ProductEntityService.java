package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.dao.CategoryDao;
import dev.ahmed.graduationproject.app.dao.ProductDao;
import dev.ahmed.graduationproject.app.dto.ProductDto;
import dev.ahmed.graduationproject.app.dto.ProductSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.ProductUpdatePriceDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.exception.ProductAlreadyExistsException;
import dev.ahmed.graduationproject.app.exception.ProductNotFoundException;
import dev.ahmed.graduationproject.app.exception.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 12:55 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Service
@Transactional
@RequiredArgsConstructor
public class ProductEntityService {

    private final ProductDao productDao;
    private final CategoryDao categoryDao;


    public Product insertProduct(ProductDto newProductDto){
        Optional<Product> productByName = productDao.findAllByProductName(newProductDto.getProductName());
        if (productByName.isPresent()){
            throw new ProductAlreadyExistsException("Product already exists with the name: " + newProductDto.getProductName());
        }
        Optional<Category> fromDbCategory = categoryDao.findAllByCategoryName(newProductDto.getCategoryName());
        Product newProduct = new Product();
        newProduct.setProductName(newProductDto.getProductName());
        newProduct.setCategoryId(fromDbCategory.get().getId());
        newProduct.setPriceWithoutKdv(newProductDto.getPriceWithoutKdv());
        newProduct.setKdvRate(fromDbCategory.get().getKdvRate());
        newProduct.setFinalPrice(newProductDto.getPriceWithoutKdv()
                .multiply(BigDecimal.valueOf(fromDbCategory.get().getKdvRate()))
                .divide(BigDecimal.valueOf(100))
                .add(newProductDto.getPriceWithoutKdv()));
         // Buralar biraz kafa complecated yazildi ama yapilan islem su:
        //  (KDV'sizFiyat * KDV / 100) + KDV'sizFiyat
        return productDao.save(newProduct);
    }

    public void updatesProductById(Long id, ProductSaveRequestDto productSaveRequestDto){
        Product oldProduct = getProductById(id);
        Category fromDbCategory = categoryDao.findCategoryByCategoryName(productSaveRequestDto.getCategoryName());

        oldProduct.setProductName(productSaveRequestDto.getProductName());
        oldProduct.setCategoryId(fromDbCategory.getId());
        oldProduct.setPriceWithoutKdv(productSaveRequestDto.getPriceWithoutKdv());
        oldProduct.setKdvRate(fromDbCategory.getKdvRate());
        oldProduct.setFinalPrice(productSaveRequestDto.getPriceWithoutKdv()
                .multiply(BigDecimal.valueOf(fromDbCategory.getKdvRate()))
                .divide(BigDecimal.valueOf(100))
                .add(oldProduct.getPriceWithoutKdv()));
        productDao.save(oldProduct);
    }

    public void updatesPriceById(Long id, ProductUpdatePriceDto productUpdatePriceDto){
        Product oldProduct = getProductById(id);
        oldProduct.setPriceWithoutKdv(productUpdatePriceDto.getPriceWithoutKdv());

        Optional<Category> fromDbCategory = categoryDao.findCategoryById(oldProduct.getCategoryId());

        oldProduct.setFinalPrice(productUpdatePriceDto.getPriceWithoutKdv()
                .multiply(BigDecimal.valueOf(fromDbCategory.get().getKdvRate()))
                .divide(BigDecimal.valueOf(100))
                .add(oldProduct.getPriceWithoutKdv()));
        productDao.save(oldProduct);
    }


    public Product getProductById(Long id){
        return productDao.findProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with that id: "+id));
    }


    public void deleteProduct(Long id) {
        Product product = productDao.getById(id);
        productDao.delete(product);
    }


    public List<Product> findAll() {
        List<Product> productList = productDao.findAll();
        return productList;
    }

    public List<Product> getAllByCategoryId(Long categoryId){
        List<Product> productList = productDao.findAllByCategoryId(categoryId);
        return productList;
    }

    public List<Product> findAllByFinalPriceBetween( BigDecimal lowprice, BigDecimal highPrice){
        List<Product> productList = productDao.findAllByFinalPriceBetween(lowprice, highPrice);
        return productList;
    }

    public Product createProduct(Product newProduct){
        // Check if product name present in DB or not
        Optional<Product> productByName = productDao.findAllByProductName(newProduct.getProductName());
        if (productByName.isPresent()){
            throw new UserAlreadyExistsException("Product already exists with the name: " + newProduct.getProductName());
        }

        // Insert values and save the product
            // KDV rate and final price not inserted from front end, So we should add it to newProcduct
        Double kdvRateFromProductCategory = categoryDao.findCategoryById(newProduct.getCategoryId()).get().getKdvRate();

        newProduct.setKdvRate(kdvRateFromProductCategory);
        newProduct.setFinalPrice(newProduct.getPriceWithoutKdv()
                .multiply(BigDecimal.valueOf(kdvRateFromProductCategory))
                .divide(BigDecimal.valueOf(100))
                .add(newProduct.getPriceWithoutKdv()));

        return productDao.save(newProduct);
    }

}
