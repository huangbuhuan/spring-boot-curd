package me.buhuan.service;

import me.buhuan.entity.User;

import java.util.List;

/**
 * Created by hbh on 2017/3/17.
 */
public interface UserService {

    List<User> list(String name);

    User get(Integer id);

    Integer update(User user);

    Integer save(User user);

    boolean remove(Integer id);

}
