package com.example.springbootmybatisdemo;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
public class SpringBootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDemoApplication.class, args);
    }

}
