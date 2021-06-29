package com.yunn.autumn.applicationclient;

import com.yun.hellospringbootstarter.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunnuan
 */
@SpringBootApplication
@RestController
@RequestMapping("/main")
public class ApplicationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationClientApplication.class, args);
    }

    @Autowired
    private HelloworldService helloworldService;

    @GetMapping
    public String sayHello() {
        return helloworldService.sayHello();
    }

}
