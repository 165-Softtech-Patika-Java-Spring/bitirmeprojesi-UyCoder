package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.dao.ProductDao;
import dev.ahmed.graduationproject.app.dto.ProductSaveRequestDto;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.exception.ProductAlreadyExistsException;
import dev.ahmed.graduationproject.app.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Product createProduct(Product newProduct){
        Optional<Product> productByName = productDao.findAllByProductName(newProduct.getProductName());
        if (productByName.isPresent()){
            throw new ProductAlreadyExistsException("Product already exists with the name: " + newProduct.getProductName());
        }
        return productDao.save(newProduct);
    }

    public void updatesProductById(Long id, ProductSaveRequestDto productSaveRequestDto){
        Product oldProduct = getProductById(id);
        oldProduct.setProductName(productSaveRequestDto.getProductName());
        oldProduct.setCategoryId(productSaveRequestDto.getCategoryId());
        oldProduct.setPriceWithoutKdv(productSaveRequestDto.getPriceWithoutKdv());
        oldProduct.setFinalPrice(productSaveRequestDto.getFinalPrice());
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


}
