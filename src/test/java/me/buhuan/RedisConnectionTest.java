package me.buhuan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hbh on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisConnectionTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("a", "a");
        System.out.println(stringRedisTemplate.opsForValue().get("a"));
    }
}
