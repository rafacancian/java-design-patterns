package com.designpatterns.command;

public class GenerateXml implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Generate XML");
    }
}
