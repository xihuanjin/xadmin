package com.tailless.xadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.tailless.xadmin.mapper")
@SpringBootApplication
public class XadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(XadminApplication.class, args);
    }

}
