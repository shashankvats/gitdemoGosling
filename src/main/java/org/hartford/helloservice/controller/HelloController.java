package org.hartford.helloservice.controller;

import org.hartford.helloservice.dto.HelloResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping
    public HelloResponseDTO sayHello() {
        return new HelloResponseDTO("Hello World from Spring MVC port: " + port);
    }
}
