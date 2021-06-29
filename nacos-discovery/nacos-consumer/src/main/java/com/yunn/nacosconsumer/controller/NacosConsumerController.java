package com.yunn.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yunN on 2021/06/14.
 */
@RestController
@RequestMapping("/nacos-consumer")
public class NacosConsumerController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Resource
    RestTemplate restTemplate;

    @GetMapping
    public String useDubbo() {


        return null;
    }

}
