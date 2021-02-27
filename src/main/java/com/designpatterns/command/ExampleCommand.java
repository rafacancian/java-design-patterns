package com.designpatterns.command;

public class ExampleCommand {

    public static void execute() {

        BaseCommand baseCommand = new GeneratePdf();
        baseCommand.execute();

        baseCommand = new GenerateXml();
        baseCommand.execute();

        baseCommand = new GenerateEmail();
        baseCommand.execute();
    }


}
