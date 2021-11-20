package com.example.dockerdemo;

import com.example.dockerdemo.exception.TestException;
import com.example.dockerdemo.mapper.UserMapper;
import com.example.dockerdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yunN
 * @date 2021/10/27
 */
@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class DockerController {

    UserMapper userMapper;

    @GetMapping
    public String hello() {
        return "Hello docker~";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userMapper.getUsers();
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
}
