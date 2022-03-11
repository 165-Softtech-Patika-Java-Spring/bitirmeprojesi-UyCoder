package dev.ahmed.graduationproject.dao;

import dev.ahmed.graduationproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:50 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
