package com.designpatterns.factory;

public class GenerateEmail implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Send by email");
    }
}
