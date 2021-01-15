package com.designpatterns.command;

public class SendEmail implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Send by email");
    }
}
