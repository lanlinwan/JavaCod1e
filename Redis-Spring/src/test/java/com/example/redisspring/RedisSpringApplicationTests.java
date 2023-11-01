package com.example.redisspring;

import com.example.redisspring.pojo.user;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

/*
RedisTemplate的两种序列化实践方案:
	方案一-:
		1. 自定义RedisTemplate
		2.修改RedisTemplate的序列化器 为GenericJackson2JsonRedisSerializer
		 (数据存储会多加一条数据类型信息)
	方案二:
		1. 使用StringRedisTemplate
		2.写入Redis时,手动把对象序列化为JSON
		3.读取Redis时， 手动把读取到的JSON反序列化为对象

 */
@SpringBootTest
class RedisSpringApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StringRedisTemplate StringredisTemplate;


    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("name", "才哥666");

        Object NAME = redisTemplate.opsForValue().get("name");
        System.out.println(NAME);
    }

    //序列化工具
    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testSaveUser() throws JsonProcessingException {

        user user = new user("lan", 19);
        //使用序列化工具手动序列化
        String json = mapper.writeValueAsString(user);
        StringredisTemplate.opsForValue().set("lanName", json);

        String NAME = StringredisTemplate.opsForValue().get("lanName");
        //手动序列化
        user user1 = mapper.readValue(json, user.class);
        System.out.println(user1);
    }

    @Test
    void testHash() {
        StringredisTemplate.opsForHash().put("user :400","name", "虎哥");
        StringredisTemplate.opsForHash().put("user :400", "age", "21");
        Map<Object,Object > entries = StringredisTemplate.opsForHash().entries("user :400");
        System.out.println("entries ="+ entries);
    }


}
