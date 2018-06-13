package com.bing.opencv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpencvServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(OpencvServerApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(OpencvServerApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(),e);
        }
    }
}
