package com.ruimap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class HomeController{
    @GetMapping("/")
    public String test(){
        return "test";
    }
    @GetMapping("/{input}")
    public String hello(@PathVariable String input){
        return "hello "+input+" Your application deployed successfully...";
    }
}

