package com.designpatterns.adapter;

public class ExampleAdapter {

    public static void execute() {
        ManagerClient managerClient = new ManagerClient();
        ClientAdapter clientBrazil = new ClientAdapter();
        ClientPortugal clientPortugal = new ClientPortugal();
        managerClient.execute(clientBrazil);
        managerClient.execute(clientPortugal);
    }

}
