package com.srpingboot.song.boot.controller;


import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    StringRedisTemplate redisTemplate ;
}
