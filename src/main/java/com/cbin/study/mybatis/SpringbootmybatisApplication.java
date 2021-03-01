package com.cbin.study.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.cbin.study.mybatis.mapper")
@SpringBootApplication(scanBasePackages = {"com.cbin.study.mybatis"})
public class SpringbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

}
