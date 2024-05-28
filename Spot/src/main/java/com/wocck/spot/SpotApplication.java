package com.wocck.spot;

import java.util.Arrays;

import com.wocck.spot.entity.User;
import com.wocck.spot.repository.UserRepository;
import com.wocck.spot.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx, UserService userService) {
        return args -> {

        };
    }

}
