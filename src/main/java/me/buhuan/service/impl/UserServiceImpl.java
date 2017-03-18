package me.buhuan.service.impl;

import me.buhuan.dao.UserRepository;
import me.buhuan.entity.User;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hbh on 2017/3/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User get(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public Integer update(User user) {
        userRepository.saveAndFlush(user);
        return user.getId();
    }

    @Override
    public Integer save(User user) {
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public boolean remove(Integer id) {
        userRepository.delete(id);
        return true;
    }
}
