package dev.ahmed.graduationproject.app.dao;


import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Category;
import org.hibernate.Session;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
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

    Category findCategoryByCategoryName(String categoryName);

    CategoryFindAllDetailsDto findAllById(Long id);

    List<Category> findAll();

    @Query("SELECT Min(finalPrice) FROM Product WHERE categoryId = ?1")
    BigDecimal findMinPriceInCategoryId(Long categoryId);

    @Query("SELECT Max(finalPrice) FROM Product WHERE categoryId = ?1")
    BigDecimal findMaxPriceInCategoryId(Long categoryId);

    @Query("SELECT avg(finalPrice) FROM Product WHERE categoryId = ?1")
    BigDecimal findAvgPriceInCategoryId(Long categoryId);

    @Query("SELECT Count(finalPrice) FROM Product WHERE categoryId = ?1")
    Long findcoundCategoryId(Long categoryId);

    @Modifying
    @Query("update Product set kdvRate = ?1 where categoryId = ?2")
    void updatesKdvRate(Double newKdv, Long categoryId);

    @Modifying
    @Query("update Product p set p.finalPrice = ( p.kdvRate * p.priceWithoutKdv/100)+p.priceWithoutKdv where p.categoryId = ?1 ")
    void updatesFinalPrice(Long categoryId);
}
