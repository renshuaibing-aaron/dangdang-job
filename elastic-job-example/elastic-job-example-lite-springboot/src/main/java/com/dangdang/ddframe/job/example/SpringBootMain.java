package com.dangdang.ddframe.job.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMain {

    // CHECKSTYLE:OFF
    public static void main(final String[] args) {
    // CHECKSTYLE:ON
      EmbedZookeeperServer.start(6181);
        SpringApplication.run(SpringBootMain.class, args);
    }
}
