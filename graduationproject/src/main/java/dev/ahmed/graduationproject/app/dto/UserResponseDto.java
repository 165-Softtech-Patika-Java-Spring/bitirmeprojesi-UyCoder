package dev.ahmed.graduationproject.app.dto;

import lombok.Data;

/**
 * @Author Ahmed Bughra
 * @Created 3/15/2022 - 12:11 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Data
public class UserResponseDto {
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
}
