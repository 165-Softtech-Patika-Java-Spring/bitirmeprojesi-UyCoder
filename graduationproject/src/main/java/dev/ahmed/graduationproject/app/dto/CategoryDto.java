package dev.ahmed.graduationproject.app.dto;

import lombok.Data;

import javax.persistence.Column;

/**
 * @Author Ahmed Bughra
 * @Created 3/14/2022 - 11:39 PM
 * @Project bitirmeprojesi-UyCoder
 */
@Data
public class CategoryDto {
    private String categoryName;
    private Double kdvRate;
}
