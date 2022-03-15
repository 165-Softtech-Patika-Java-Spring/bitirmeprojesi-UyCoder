package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.converter.UserMapperImpl;
import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.converter.UserMapper;
import dev.ahmed.graduationproject.app.dao.UserDao;
import dev.ahmed.graduationproject.app.dto.UserResponseDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.UserUpdateRequestDto;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.gen.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.webjars.NotFoundException;

import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:55 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Service
@Transactional
@RequiredArgsConstructor
public class UserEntityService {

    private final UserDao userDao;


    public User save(User user) {
        return userDao.save(user);
    }

    public User update(User user){
        return userDao.save(user);
    }

//    public User updates(Long id, UserDto userDto){
//        User user = UserMapper.INSTANCE.convertToUser(userDto);
//        return userDao.save(user);
//    }

    public User updatesById(Long id, UserDto userDto){
        Optional<User> userOptional = userDao.findById(id);

        if (userOptional.isPresent()){
             User user = userOptional.get();
        } else {
            throw new NotFoundException("Item not found!");
        }
        return userDao.save(UserMapper.INSTANCE.convertToUser(userDto));
    }


    public User getById(Long id){
        User user = userDao.getById(id);
        return user;
    }

    public void deleteUser(Long id) {
        User user = userDao.getById(id);
        userDao.delete(user);
    }


//    public UserDto updateUser(UserUpdateRequestDto userUpdateRequestDto) {
//        controlIsUserExist(userUpdateRequestDto);
//
//        User user;
//        user = UserMapper.INSTANCE.convertToUser(userUpdateRequestDto);
//        userEntityService.save(user);
//
//        UserDto userDto = UserMapper.INSTANCE.convertToUserDto(user);
//
//        return userDto;
//    }
//
//    private void controlIsUserExist(UserUpdateRequestDto userUpdateRequestDto) {
//
//        Long id = userUpdateRequestDto.getId();
//        boolean isExist = userEntityService.existsById(id);
//        if (!isExist){
//            throw new ItemNotFoundException(UserErrorMessage.CUSTOMER_ERROR_MESSAGE);
//        }
//    }
        public UserResponseDto saveUser(UserSaveRequestDto userSaveRequestDto){
            User user = UserMapper.INSTANCE.convertToUser(userSaveRequestDto);
            user = userDao.save(user);
            UserResponseDto userResponseDto = UserMapper.INSTANCE.convertToUserResponseDto(user);
            return userResponseDto;
        }


}
