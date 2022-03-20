package dev.ahmed.graduationproject.app.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 3/14/2022 - 11:39 PM
 * @Project bitirmeprojesi-UyCoder
 */
@Data
public class CategoryFindAllDetailsDto {
    private String categoryName;
    private Double kdvRate;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private BigDecimal averagePrice;
    private Long productCount;
}
