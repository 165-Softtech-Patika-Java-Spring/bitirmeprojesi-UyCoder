package dev.ahmed.graduationproject.service.entityservice;

import dev.ahmed.graduationproject.dao.UserDao;
import dev.ahmed.graduationproject.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Ahmed Bughra
 * @Created 3/12/2022 - 12:55 AM
 * @Project bitirmeprojesi-UyCoder
 */

@Service
@Transactional
@RequiredArgsConstructor
public class UserEntityService {

    public final UserDao userDao;

    public User save(User user) {
        return userDao.save(user);
    }
}
