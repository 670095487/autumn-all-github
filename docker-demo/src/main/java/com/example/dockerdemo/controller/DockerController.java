package com.example.dockerdemo.controller;

import com.example.dockerdemo.exception.TestException;
import com.example.dockerdemo.mapper.UserMapper;
import com.example.dockerdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yunN
 * @date 2021/10/27
 */
@RestController
@RequestMapping("/DockerController")
@AllArgsConstructor
public class DockerController {

   private final UserMapper userMapper;

    @GetMapping
    public String hello() {
        return "Hello docker~";
    }

    @GetMapping("/user")
    public Iterable<User> getUsers() {
        return userMapper.findAll();
    }

    @GetMapping("/exception/{id}")
    public Integer getException(@PathVariable Integer id) {
        if (id == 1) {
            throw new TestException(9001, "test exception msg");
        }else {
            int a = 1 / 0;
        }
        return 1;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        userMapper.save(user);
        return user;
    }

    @PostMapping("/batch")
    public List<User> addUser(@RequestBody List<User> users) {
        userMapper.saveAll(users);
        return users;
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        userMapper.updateUser(user);
        return user;
    }
}
