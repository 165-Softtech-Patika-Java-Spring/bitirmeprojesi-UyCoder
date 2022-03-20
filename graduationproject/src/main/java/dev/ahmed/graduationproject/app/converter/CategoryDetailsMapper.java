package dev.ahmed.graduationproject.app.converter;

import dev.ahmed.graduationproject.app.dto.CategoryFindAllDetailsDto;
import dev.ahmed.graduationproject.app.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @Author Ahmed Bughra
 * @Created 3/21/2022 - 12:34 AM
 * @Project bitirmeprojesi-Ahemd-Bughra
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryDetailsMapper {
    CategoryDetailsMapper INSTANCE = Mappers.getMapper(CategoryDetailsMapper.class);
    CategoryFindAllDetailsDto convertToFindAllDetailDto(Category category);
}
