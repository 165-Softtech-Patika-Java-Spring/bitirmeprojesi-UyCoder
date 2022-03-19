package dev.ahmed.graduationproject.app.dto;

import lombok.Data;
import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 3/17/2022 - 2:02 AM
 * @Project bitirmeprojesi-UyCoder
 */
@Data
public class ProductSaveRequestDto {
    private String productName;
    private String categoryName;
    private BigDecimal priceWithoutKdv;
}
