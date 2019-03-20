package com.ttn.springboot;
import com.ttn.springboot.entity.Database;
import com.ttn.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean
    User user() {
        return new User("Manidhar", "Mani023");
    }

    @Bean
    Database database() {
        return new Database();
    }

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

}
