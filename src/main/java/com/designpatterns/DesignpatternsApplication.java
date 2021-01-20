package com.designpatterns;

import com.designpatterns.intercept.Intercept;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);

        // Singleton.execute();

        // Command.execute();

        // Factory.execute();

        // Adapter.execute();

        // Observer.execute();

        // ChainOfResponsibility.execute();

        // Strategy.execute();

        Intercept.execute();
    }

}
