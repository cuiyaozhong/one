package com.example.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 崔耀中
 * @since 2020-08-09
 */
@RestController
public class RedisController {

    // 配置 StringRedisTemplate
    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory);
        return stringRedisTemplate;
    }


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/helloRedis")
    public String hello() {

//        // 向 Redis 中添加一个 key 为 hello，Value 为 world 的记录
//        stringRedisTemplate.opsForValue().set("hello","world");
//
//        // 获取 Redis 中 key 为 hello 的值
//        return stringRedisTemplate.opsForValue().get("hello");


        //批量操作一个key值时，可以使用boundxxxOps() 方法
        BoundValueOperations<String, String> boundValueOps = stringRedisTemplate.boundValueOps("boundValueOps");
        boundValueOps.set("boundValueOperation");
        return boundValueOps.get();
    }


}
