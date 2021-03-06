package com.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;
import javax.swing.*;

@EnableScheduling//@EnableScheduling注解 进行定时任务
@MapperScan("com.course.model")
@SpringBootApplication
public class Application {
    private  static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class,args);
    }
    @PreDestroy
    public void close() {
        Application.context.close();
    }
}
