package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.dao.CategoryDao;
import dev.ahmed.graduationproject.app.dto.CategoryUpdateKdvDto;
import dev.ahmed.graduationproject.app.entity.Category;
import dev.ahmed.graduationproject.app.exception.CategoryAlreadyExistsException;
import dev.ahmed.graduationproject.app.exception.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public void updatesKdvById(Long id, CategoryUpdateKdvDto categoryUpdateKdv) {
        Category oldCategory = getCateroyById(id);
        oldCategory.setKdvRate(categoryUpdateKdv.getKdvRate());
    }

    public Category getCateroyById(Long id) {
        return categoryDao.findCategoryById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category not found with that id: " + id));
    }
}
