package com.helloworld.hello_world.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getResponse() {
        String msg_1 = restTemplate.getForObject("http://hello-service:8080/hello", String.class);
        String msg_2 = restTemplate.getForObject("http://localhost:8082/world", String.class);

        return msg_1 + " " + msg_2;
    }
}
