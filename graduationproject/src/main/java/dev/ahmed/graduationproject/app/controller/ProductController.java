package dev.ahmed.graduationproject.app.controller;

import dev.ahmed.graduationproject.app.dto.ProductDto;
import dev.ahmed.graduationproject.app.dto.ProductSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.ProductUpdatePriceDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.service.entityservice.ProductEntityService;
import dev.ahmed.graduationproject.app.service.entityservice.UserEntityService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    // Ürünlerin fiyatları güncellenebilir.
    @PutMapping("/{id}/price")
    @Operation(tags = "Product Controller", description = "Update Product Price", summary = "Update Product Price")
    public ResponseEntity updatePriceById(@PathVariable Long id, @RequestBody ProductUpdatePriceDto productUpdatePriceDto){
        productEntityService.updatesPriceById(id, productUpdatePriceDto);
        return new ResponseEntity<>(OK);
    }

    // Sisteme yeni Product tanımlanabilir
    // Tüm ürünler listelenebilmelidir.
    // Ürün türlerine göre ürünler listelenebilmelidir.
    // Belirli bir fiyat aralığındaki ürünler listelenebilmelidir.
    // Ürün türlerine göre aşağıdaki gibi detay veri içeren bir bilgilendirme alınabilmelidir

    // Sisteme yeni urun tanımlanabilir
    @PostMapping
    @Operation(tags = "Product Controller", description = "Craate New Product", summary = "Create New Product")
    public ResponseEntity createProduct(@RequestBody ProductDto productDto) {
        Product product = productEntityService.insertProduct(productDto);
        return ResponseEntity.ok(product);
    }
//    @PostMapping
//    @Operation(tags = "Product Controller", description = "Craate New Product", summary = "Create New Product")
//    public ResponseEntity createProduct(@RequestBody Product product) {
//        product = productEntityService.createProduct(product);
//        return ResponseEntity.ok(product);
//    }
//


    // Product güncellenebilir
    @PutMapping("/{id}")
    @Operation(tags = "Product Controller", description = "Update Product", summary = "Update Product")
    public ResponseEntity<Void> updateProductById(@PathVariable Long id, @RequestBody ProductSaveRequestDto productSaveRequestDto){
        productEntityService.updatesProductById(id, productSaveRequestDto);
        return new ResponseEntity<>(OK);
    }

    // Product silinebilir.
    @DeleteMapping("/{id}")
    @Operation(tags = "Product Controller", description = "Delete Product", summary = "Delete Product")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        productEntityService.deleteProduct(id);
        return ResponseEntity.ok(Void.TYPE);
    }

}
