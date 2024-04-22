package com.example.manager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TaskManagerSystemApplication implements Runnable{
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerSystemApplication.class, args);
    }
    @Override
    public void run() {
        log.info("http://localhost:9000/h2-console/");
    }
}
