package com.sun.nawdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NawDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(NawDemoApplication.class, args);
        System.out.println("========== NawDemoApplication started ==========");
        System.out.println("Time: " + java.time.Instant.now());
    }

}
