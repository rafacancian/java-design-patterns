package com.designpatterns.factory;

public class ExampleFactory {


    public static void execute() {

        final CommandFactory commandFactory = new CommandFactory();
        BaseCommand baseCommand;

        baseCommand = commandFactory.create("GenerateEmail");
        baseCommand.execute();

        baseCommand = commandFactory.create("GeneratePdf");
        baseCommand.execute();

        baseCommand = commandFactory.create("GenerateXml");
        baseCommand.execute();


    }

}
