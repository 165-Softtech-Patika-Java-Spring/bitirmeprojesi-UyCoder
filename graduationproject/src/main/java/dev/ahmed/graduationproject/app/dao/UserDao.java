package dev.ahmed.graduationproject.app.dao;

import dev.ahmed.graduationproject.app.dto.UserDto;
import dev.ahmed.graduationproject.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:50 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    Optional<User> findUserById(Long id);

    Optional<User> findAllByUserName(String userName);



}
