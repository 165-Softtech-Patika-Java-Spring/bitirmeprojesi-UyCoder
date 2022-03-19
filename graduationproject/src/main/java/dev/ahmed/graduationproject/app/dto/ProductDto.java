package dev.ahmed.graduationproject.app.dto;

import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 3/14/2022 - 11:39 PM
 * @Project bitirmeprojesi-UyCoder
 */
@Data
public class ProductDto {
    private String productName;
    private String categoryName;
    private BigDecimal priceWithoutKdv;
}
