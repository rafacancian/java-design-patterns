package com.designpatterns;

import com.designpatterns.singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);
        Singleton.execute();
    }

}
