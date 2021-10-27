package com.example.dockerdemo;

import com.example.dockerdemo.mapper.UserMapper;
import com.example.dockerdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yunN
 * @date 2021/10/27
 */
@RestController
@RequestMapping("/hello")
public class DockerController {

    @Autowired
    UserMapper userMapper;

    @GetMapping
    public String hello() {
        return "Hello docker~";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
