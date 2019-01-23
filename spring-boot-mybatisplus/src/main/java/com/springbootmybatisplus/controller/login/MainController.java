package com.springbootmybatisplus.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.springbootmybatisplus.config.SystemMapper;
import com.springbootmybatisplus.config.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@Controller
public class MainController {
    @Autowired
    SystemMapper systemMapper;

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {
        model.addAttribute("name", account);
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/loginPost")
    public String loginPost(String account, String password, String return_url,HttpSession session, Model model) {
        Map<String, Object> map = new HashMap<>();
        if (!"123456".equals(password)) {
            map.put("success", false);
            map.put("message", "密码错误");
            return "login";
        }

        // 设置session
        session.setAttribute(WebSecurityConfig.SESSION_KEY, account);

        map.put("success", true);
        map.put("message", "登录成功");
        model.addAttribute("name", account);
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }

    @GetMapping("/registered")
    public String registered(String account,String password) {

        systemMapper.insert(new System(account, password));
        return "redirect:/login";
    }
}