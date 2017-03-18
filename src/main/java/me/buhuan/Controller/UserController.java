package me.buhuan.Controller;

import me.buhuan.entity.User;
import me.buhuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hbh on 2017/3/18.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list(User user) {
        return userService.list(user.getName());
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get(Integer id) {
        return userService.get(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Integer update(User user) {
        return userService.update(user);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Integer save(User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public boolean remove(Integer id) {
        return userService.remove(id);
    }

    @RequestMapping(value = "/setCache", method = RequestMethod.POST)
    public boolean setCache(String data) {
        stringRedisTemplate.opsForValue().set("test", data);
        return true;
    }

    @RequestMapping(value = "/getCache", method = RequestMethod.GET)
    public String getCache() {
        return stringRedisTemplate.opsForValue().get("test");
    }

    @RequestMapping("/test")
    public String test() {
        return "true";
    }
}
