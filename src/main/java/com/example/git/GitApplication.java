package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        System.out.println("hello,word");
        System.out.println("hot-fix");
        System.out.println("hot-fix2");
        System.out.println("master");
        SpringApplication.run(GitApplication.class, args);
    }

}
