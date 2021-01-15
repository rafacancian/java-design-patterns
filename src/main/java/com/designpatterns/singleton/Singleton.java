package com.designpatterns.singleton;

public class Singleton {

    public static void execute() {
        System.out.println("Design Pattern - Singleton");

        ConfigManager configManager = ConfigManager.getInstance();
        String serviceName = configManager.getServerName();
        System.out.println("execute operation from configManager " + serviceName);
    }
}
