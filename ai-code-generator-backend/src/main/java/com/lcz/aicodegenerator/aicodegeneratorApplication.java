package com.lcz.aicodegenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lcz.aicodegenerator.mapper")
@SpringBootApplication
public class aicodegeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(aicodegeneratorApplication.class, args);
    }

}
