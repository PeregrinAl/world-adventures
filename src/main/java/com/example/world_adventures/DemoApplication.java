package com.example.world_adventures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories("com.example.world_adventures.*")
@RestController
@ComponentScan(basePackages = { "com.example.world_adventures.*" })
@EntityScan("com.example.world_adventures.*")
public class DemoApplication {
    public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
}
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "читатель Skillbox Media") String name) {
    return String.format("Hello, %s!", name);
    }
   }
