package dev.ahmed.graduationproject.app.service.entityservice;

import dev.ahmed.graduationproject.app.converter.UserMapperImpl;
import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.converter.UserMapper;
import dev.ahmed.graduationproject.app.dao.UserDao;
import dev.ahmed.graduationproject.app.dto.UserResponseDto;
import dev.ahmed.graduationproject.app.dto.UserSaveRequestDto;
import dev.ahmed.graduationproject.app.dto.UserUpdateRequestDto;
import dev.ahmed.graduationproject.app.entity.User;
import dev.ahmed.graduationproject.app.exception.UserAlreadyExistsException;
import dev.ahmed.graduationproject.app.exception.UserNotFoundException;
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

    public User createUser(User newUser){
        Optional<User> userByName = userDao.findAllByUserName(newUser.getUserName());
        if (userByName.isPresent()){
            throw new UserAlreadyExistsException("User already exists with the name: " + newUser.getUserName());
        }
        return userDao.save(newUser);
    }

    public void updatesById(Long id, UserSaveRequestDto userSaveRequestDto){
        User oldUser = getUserById(id);
        oldUser.setUserName(userSaveRequestDto.getUserName());
        oldUser.setPassword(userSaveRequestDto.getPassword());
        oldUser.setFirstName(userSaveRequestDto.getFirstName());
        oldUser.setLastName(userSaveRequestDto.getLastName());
        userDao.save(oldUser);
    }



    public User getUserById(Long id){
        return userDao.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with that id: "+id));
    }


    public void deleteUser(Long id) {
        User user = userDao.getById(id);
        userDao.delete(user);
    }


}
