package com.designpatterns.command;

public class GenerateEmail implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Send by email");
    }
}
