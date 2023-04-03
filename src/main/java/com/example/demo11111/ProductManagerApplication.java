package com.example.demo11111;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication (scanBasePackages = "com.example.demo11111")
public class ProductManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductManagerApplication.class, args);
    }

}
