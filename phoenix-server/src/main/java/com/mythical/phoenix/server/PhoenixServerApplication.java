package com.mythical.phoenix.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author: zhn4528
 * create: 2022/2/10 13:51
*/
@SpringBootApplication(
        scanBasePackages = "com.mythical.phoenix"
)
public class PhoenixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoenixServerApplication.class, args);
    }

}
