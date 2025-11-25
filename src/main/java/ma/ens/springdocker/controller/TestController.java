package ma.ens.springdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot Docker Application!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running!";
    }
}