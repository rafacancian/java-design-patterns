package com.designpatterns.factory;

public class GenerateXml implements BaseCommand {

    @Override
    public void execute() {
        System.out.println("Generate XML");
    }
}
