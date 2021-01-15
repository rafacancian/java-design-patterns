package com.designpatterns.factory;

public class GeneratePdf implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Generate PDF");
    }
}
