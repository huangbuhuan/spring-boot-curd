package me.buhuan.dao;

import me.buhuan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by hbh on 2017/3/17.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);

}
