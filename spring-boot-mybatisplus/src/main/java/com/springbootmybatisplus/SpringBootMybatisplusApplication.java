package com.springbootmybatisplus;

import com.springbootmybatisplus.config.UserMapper;
import com.springbootmybatisplus.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@MapperScan("com.springbootmybatisplus.config")
public class SpringBootMybatisplusApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisplusApplication.class, args);
    }
}
