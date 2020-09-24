package com.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
@MapperScan("com.module.mapper")
public class CommonwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonwebApplication.class, args);
        PageHelperConfig.showStartInfo(); //控制台显示系统访问路径
    }


}
