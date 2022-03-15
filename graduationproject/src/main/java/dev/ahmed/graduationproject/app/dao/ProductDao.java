package dev.ahmed.graduationproject.app.dao;

import dev.ahmed.graduationproject.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:50 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
}
