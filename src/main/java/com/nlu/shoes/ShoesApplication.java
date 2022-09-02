package com.nlu.shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ShoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoesApplication.class, args);
    }

}
