package com.roy.modulecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.roy")
public class ModuleControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleControllerApplication.class, args);
    }

}
