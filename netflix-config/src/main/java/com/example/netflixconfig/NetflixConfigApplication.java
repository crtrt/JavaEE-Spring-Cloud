package com.example.netflixconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //config
public class NetflixConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixConfigApplication.class, args);
    }

}
