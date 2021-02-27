package com.designpatterns.intercept;

public class ExampleIntercept {

    public static void execute() {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new AutorizationFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("User");
    }
}
