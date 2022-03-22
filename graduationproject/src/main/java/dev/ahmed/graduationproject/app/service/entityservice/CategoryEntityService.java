package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.dao.CategoryDao;
import dev.ahmed.graduationproject.app.dao.ProductDao;
import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.dto.CategoryUpdateKdvDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.exception.CategoryAlreadyExistsException;
import dev.ahmed.graduationproject.app.exception.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/19/2022 - 10:53 PM
 * @Project bitirmeprojesi-UyCoder
 */
@Service
@Transactional
@RequiredArgsConstructor
public class CategoryEntityService {

    private final CategoryDao categoryDao;
    private final ProductDao productDao;

    public Category createCategory(Category newCategory){
        Optional<Category> categoryByName = categoryDao.findAllByCategoryName(newCategory.getCategoryName());
        if (categoryByName.isPresent()){
            throw new CategoryAlreadyExistsException("Category already exists with the name: " + newCategory.getCategoryName());
        }
        return categoryDao.save(newCategory);
    }

    public void deleteCategory(Long id) {
        Category category = categoryDao.getById(id);
        categoryDao.delete(category);
    }

    @Transactional
    public void updatesKdvById(Long id, CategoryUpdateKdvDto categoryUpdateKdv) {
        Category oldCategory = getCateroyById(id);
        oldCategory.setKdvRate(categoryUpdateKdv.getKdvRate());

        updateProductsTable(oldCategory.getKdvRate(), id);
    }
    public void updateProductsTable(Double newKdv, Long categoryId ) {
        categoryDao.updatesKdvRate(newKdv, categoryId);
        categoryDao.updatesFinalPrice(categoryId);
    }


    public Category getCateroyById(Long id) {
        return categoryDao.findCategoryById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found with that id: " + id));
    }

    public CategoryFindAllDetailsDto findAllDetails(Long id) {
        Category oldCategory = getCateroyById(id);
        CategoryFindAllDetailsDto categoryFindAllDetailsDto = new CategoryFindAllDetailsDto();
        categoryFindAllDetailsDto.setCategoryName(oldCategory.getCategoryName());
        categoryFindAllDetailsDto.setKdvRate(oldCategory.getKdvRate());

        categoryFindAllDetailsDto.setMinPrice(categoryDao.findMinPriceInCategoryId(id));
        categoryFindAllDetailsDto.setMaxPrice(categoryDao.findMaxPriceInCategoryId(id));
        categoryFindAllDetailsDto.setAveragePrice(categoryDao.findAvgPriceInCategoryId(id));
        categoryFindAllDetailsDto.setProductCount(categoryDao.findcoundCategoryId(id));

        return categoryFindAllDetailsDto;

    }

    public Integer getCategoryCount() {
        return categoryDao.findAll().size();
    }

}
