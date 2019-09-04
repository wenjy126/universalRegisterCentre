package com.netzoom.urc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrcApplication.class, args);
    }

}
