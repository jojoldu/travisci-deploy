package com.jojoldu.book.travis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public static final String MESSAGE = "Hello! MicroSoftware";

    @GetMapping("/")
    public String hello () {
        return MESSAGE;
    }
}
