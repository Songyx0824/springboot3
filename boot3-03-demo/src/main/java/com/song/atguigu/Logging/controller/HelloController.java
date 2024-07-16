package com.song.atguigu.Logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    Logger logger =  LoggerFactory.getLogger(getClass());

    @GetMapping("/hello")
    public String hello(){
        logger.info("这是一个日志");
        return "Hello Word !!!";
    }

}
