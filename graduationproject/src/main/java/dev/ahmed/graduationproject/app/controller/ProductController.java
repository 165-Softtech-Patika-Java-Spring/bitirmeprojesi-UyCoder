package dev.ahmed.graduationproject.app.controller;

import dev.ahmed.graduationproject.app.dto.ProductDto;
import dev.ahmed.graduationproject.app.dto.ProductSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.ProductUpdatePriceDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.ProductEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import dev.ahmed.graduationproject.gen.dto.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 12:52 AM
 * @Project bitirmeprojesi-UyCoder
 */

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductEntityService productEntityService;

    // Sisteme yeni urun tanımlanabilir == Bitti
    @PostMapping
    @Operation(tags = "Product Controller", description = "Craate New Product", summary = "Create New Product")
    public ResponseEntity createProduct(@RequestBody ProductDto productDto) {
        Product product = productEntityService.insertProduct(productDto);
        return ResponseEntity.ok(product);
    }

    // Ürünlerin fiyatları güncellenebilir.  == Bitti
    @PutMapping("/{id}/price")
    @Operation(tags = "Product Controller", description = "Update Price", summary = "Update Price")
    public ResponseEntity updatePriceById(@PathVariable Long id, @RequestBody ProductUpdatePriceDto productUpdatePriceDto){
        productEntityService.updatesPriceById(id, productUpdatePriceDto);
        return new ResponseEntity<>(OK);
    }

    // urunler güncellenebilir  (urun adi, categorisi ve KDV'siz fiyati)   == Bitti
    @PutMapping("/{id}")
    @Operation(tags = "Product Controller", description = "Update Product Name, Category and Price", summary = "Update Product")
    public ResponseEntity<Void> updateProductById(@PathVariable Long id, @RequestBody ProductSaveRequestDto productSaveRequestDto){
        productEntityService.updatesProductById(id, productSaveRequestDto);
        return new ResponseEntity<>(OK);
    }

    // Product silinebilir.  == Bitti
    @DeleteMapping("/{id}")
    @Operation(tags = "Product Controller", description = "Delete Product", summary = "Delete Product")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        productEntityService.deleteProduct(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    // Tüm ürünler listelenebilmelidir. == Bitti
    @GetMapping
    @Operation(tags = "Product Controller", description = "List All Products", summary = "List All Product")
    public ResponseEntity getAll(){
        List<Product> productList = productEntityService.findAll();
        return ResponseEntity.ok(RestResponse.of(productList));
    }

    // Ürün türlerine göre ürünler listelenebilmelidir. == Bitti
    @GetMapping("/{categoryId}")
    @Operation(tags = "Product Controller", description = "List All Products By Category Id", summary = "List Products By Category Id")
    public ResponseEntity getAllByCategoryId(@PathVariable Long categoryId){
        List<Product> productList = productEntityService.getAllByCategoryId(categoryId);
        return ResponseEntity.ok(RestResponse.of(productList));
    }

    // Belirli bir fiyat aralığındaki ürünler listelenebilmelidir. == Bitti
    @GetMapping("/find")
    @Operation(tags = "Product Controller", description = "List Products between two price ", summary = "List Products between two price")
    public ResponseEntity findAllByFinalPriceBetween(@RequestParam BigDecimal lowprice,
                                              @RequestParam BigDecimal highPrice) {
        List<Product> productList = productEntityService.findAllByFinalPriceBetween(lowprice, highPrice);
        return ResponseEntity.ok(RestResponse.of(productList));
    }

}
