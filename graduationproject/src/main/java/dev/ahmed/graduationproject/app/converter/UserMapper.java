package dev.ahmed.graduationproject.app.converter;

import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.dto.UserResponseDto;
import dev.ahmed.graduationproject.app.dto.UserUpdateRequestDto;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 3/15/2022 - 12:08 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User convertToUser(UserDto userDto);
    User convertToUser(UserSaveRequestDto userSaveRequestDto);
    User convertToUser(UserUpdateRequestDto userUpdateRequestDto);
    List<UserDto> convertToUserDtoList(List<User> userList);
    UserDto convertToUserDto(User user);
    UserResponseDto convertToUserResponseDto(User user);

}

