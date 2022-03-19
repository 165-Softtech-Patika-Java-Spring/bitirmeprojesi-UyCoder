package dev.ahmed.graduationproject.app.entity;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Locale;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:02 AM
 * @Project bitirmeprojesi-UyCoder
 */
@Entity
@Table(name = "PRODUCTS")
@Getter
@Setter
public class Product {

    @Id
    @SequenceGenerator(name = "Product" , sequenceName = "PRODUCT_ID_SEQ")
    @GeneratedValue(generator = "Product")
    private Long id;

    @Column(name = "PRODUCT_NAME", length = 30, nullable = false)
    private String productName;

    @Column(name = "ID_CATEGORY")
    private Long categoryId;

    @Column(name = "PRICE_WITHOUT_KDV", nullable = false)
    private BigDecimal priceWithoutKdv;

    @Column(name = "KDV_RATE")
    private Double kdvRate;

    @Column(name = "FINAL_PRICE")
    private BigDecimal finalPrice;
}
