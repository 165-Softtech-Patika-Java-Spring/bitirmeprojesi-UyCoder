package dev.ahmed.graduationproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:02 AM
 * @Project bitirmeprojesi-UyCoder
 */
@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @SequenceGenerator(name = "Product" , sequenceName = "PRODUCT_ID_SEQ")
    @GeneratedValue(generator = "Product")
    private Long id;

    @Column(name = "PRODUCT_NAME", length = 30, nullable = false)
    private String productName;

    @Column(name = "PRODUCT_CATEGORY", length = 30, nullable = false)
    private String productCategory;

    @Column(name = "PRICE_WITHOUT_KDV", nullable = false)
    private BigDecimal priceWithoutKdv;

    @Column(name = "KDV_RATE")
    private Double kdvRate;

    @Column(name = "FINAL_PRICE")
    private BigDecimal finalPrice;
}
