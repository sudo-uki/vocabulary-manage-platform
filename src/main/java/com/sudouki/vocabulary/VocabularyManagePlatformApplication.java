package com.sudouki.vocabulary;

import com.sudouki.vocabulary.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.sudouki.vocabulary.mapper")
public class VocabularyManagePlatformApplication {

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(VocabularyManagePlatformApplication.class, args);
    }

    public VocabularyManagePlatformApplication(UserService userService) {
        this.userService = userService;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return args -> {
            userService.insert();
        };
    }

}
