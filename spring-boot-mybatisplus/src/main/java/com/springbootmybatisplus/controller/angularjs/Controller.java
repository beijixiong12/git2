package com.springbootmybatisplus.controller.angularjs;

import com.springbootmybatisplus.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test")
    public User sayHello(){
        System.out.println("==================> augular");
        User user = new User();
        user.setName("jackson");
        user.setAge(23);
        return user;
    }

}
