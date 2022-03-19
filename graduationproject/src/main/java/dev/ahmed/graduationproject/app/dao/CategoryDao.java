package dev.ahmed.graduationproject.app.dao;


import dev.ahmed.graduationproject.app.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:50 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
    Optional<Category> findCategoryById(Long id);
    Optional<Category> findAllByCategoryName(String categoryName);

}
