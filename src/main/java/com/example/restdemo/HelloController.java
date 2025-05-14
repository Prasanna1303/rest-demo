package com.example.restdemo;

@org.springframework.web.bind.annotation.RestController
public class HelloController {

    @org.springframework.web.bind.annotation.GetMapping("/hello")
    public String hello() {
        return "Hello, Enforce Pull requests !";
    }

}
