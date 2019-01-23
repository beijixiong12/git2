package com.springbootmybatisplus.controller.thymeleaf;

import com.springbootmybatisplus.config.UserMapper;
import com.springbootmybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/**
 * 测试demo的controller
 *
 * @author zcc ON 2018/2/8
 **/
@Controller
class HelloController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/hello")
    public String hello(Model model) {

        List<User> empList = userMapper.selectList(null);

        model.addAttribute("empList", empList);
        return "hello";
    }
}