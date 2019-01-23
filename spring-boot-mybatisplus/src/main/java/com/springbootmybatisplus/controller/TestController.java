package com.springbootmybatisplus.controller;

import com.springbootmybatisplus.config.UserMapper;
import com.springbootmybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/add")
    String add(){
        User u=new User();
        u.setAge(5);
        u.setName("吵吵");
        u.setEmail("beijixiong@ibeidiao.com");
        userMapper.insert(u);
        return "插入成功";
    }
}
