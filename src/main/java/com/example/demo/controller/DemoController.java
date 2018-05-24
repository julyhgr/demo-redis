package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class DemoController {

    @Autowired
    UserRedis userRedis;

    @RequestMapping("/add")
    public String add() {
        User user = new User();
        user.setName("nameooo");
        userRedis.add("2", 10L, user);

        return userRedis.get("2").getName();
    }
}
