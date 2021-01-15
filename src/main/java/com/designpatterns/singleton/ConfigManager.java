package com.designpatterns.singleton;


public class ConfigManager {

    // create just one instance
    private static ConfigManager instance = new ConfigManager();

    // create just one lazy instance
    private static ConfigManager instanceLazy;

    // singleton x static (in this case is not a good practice put all attributes with static)
    private String serverName = "Oracle";

    // set constructor to private to avoid create new instance out of the class
    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    // synchronized to manager threads and create lazy instance
    public static synchronized ConfigManager getInstanceLazy() {
        if (instanceLazy == null) instanceLazy = new ConfigManager();
        return instanceLazy;
    }

    public String getServerName() {
        return serverName;
    }

}
