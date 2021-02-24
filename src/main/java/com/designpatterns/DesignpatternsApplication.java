package com.designpatterns;

import com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod.ChainOfResponsibilityDiscountV2;
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

        // ChainOfResponsibilityLogger.execute();
        //ChainOfResponsibilityDiscount.execute();
        ChainOfResponsibilityDiscountV2.execute();

        //Strategy.execute();

        // Intercept.execute();

        //SolidExecute.execute();
    }

}
