package com.nlu.shoes;

import java.util.Arrays;

import com.nlu.shoes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShoesAppStartupRunner implements CommandLineRunner{

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.createUser("admin", "admin", "admin@admin.com", Arrays.asList("ROLE_USER", "ROLE_ADMIN"));
    }
}
