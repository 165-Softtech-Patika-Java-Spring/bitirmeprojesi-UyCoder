package dev.ahmed.graduationproject.app.controller;

import dev.ahmed.graduationproject.app.dto.CategoryUpdateKdvDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.service.entityservice.CategoryEntityService;
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
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryEntityService categoryEntityService;


    // urun turu/ kdv orani/ min fiyat/ max fiyat/ortalama fiyat/ urun sayisi



    // Urun kategorisi tanimlanacak
    @PostMapping
    @Operation(tags = "Category Controller", description = "Craete New Category", summary = "Create New Category")
    public ResponseEntity createCategory(@RequestBody Category category) {
        category = categoryEntityService.createCategory(category);
        return ResponseEntity.ok(category);
    }

    // kategoriyisinin kdv orani guncellenecek !!!!!!!!!! eski finalPrice lar da guncellenecek!!!! Scheduler????
    @PutMapping("/{id}/kdv")
    @Operation(tags = "Category Controller", description = "Update Category KDV Rate", summary = "Update KDV Rate")
    public ResponseEntity updateKdv(@PathVariable Long id, @RequestBody CategoryUpdateKdvDto categoryUpdateKdv){
        categoryEntityService.updatesKdvById(id, categoryUpdateKdv);
        return new ResponseEntity<>(OK);
    }


    // urun kategorisi silinecek
    @DeleteMapping("/{id}")
    @Operation(tags = "Category Controller", description = "Delete Category", summary = "Delete Category")
    public ResponseEntity deleteCategory(@PathVariable Long id){
        categoryEntityService.deleteCategory(id);
        return ResponseEntity.ok(Void.TYPE);
    }
}
