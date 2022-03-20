package dev.ahmed.graduationproject.app.dao;

import dev.ahmed.graduationproject.app.dto.ProductDto;
import dev.ahmed.graduationproject.app.entity.Product;
import dev.ahmed.graduationproject.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.basic.BasicIconFactory;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:50 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
    Optional<Product> findProductById(Long id);

    Optional<Product> findAllByProductName(String userName);

    List<Product> findAllByCategoryId(Long categoryId);

    List<Product> findAllByFinalPriceBetween(BigDecimal lowPrice, BigDecimal highPrice);
//    List<Product> findAllByPriceWithoutKdvIsBetween(BigDecimal lowPrice, BigDecimal highPrice);

}
