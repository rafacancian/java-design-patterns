package com.designpatterns.command;

public class GeneratePdf implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Generate PDF");
    }
}
