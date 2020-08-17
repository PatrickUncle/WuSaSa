package com.wusasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wusasa.mapper")
public class WusasaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WusasaApplication.class, args);
    }
}