package dev.ahmed.graduationproject.app.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Ahmed Bughra
 * @Created 3/19/2022 - 10:30 PM
 * @Project bitirmeprojesi-UyCoder
 */
@Data
public class ProductUpdatePriceDto {
    private BigDecimal priceWithoutKdv;
}
