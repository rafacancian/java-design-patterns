package com.designpatterns.factory;

public class Factory {

    private CommandFactory commandFactory = new CommandFactory();

    public void execute() {

        buttonSendEmailClicked();
        buttonSendPdfClicked();
        buttonSendXmlClicked();
    }

    public void buttonSendEmailClicked() {
        //BaseCommand baseCommand = commandFactory.createAntPattern("GenerateEmail");
        BaseCommand baseCommand = commandFactory.create("GenerateEmail");
        baseCommand.execute();
    }

    public void buttonSendPdfClicked() {
        //BaseCommand baseCommand = commandFactory.createAntPattern("GeneratePdf");
        BaseCommand baseCommand = commandFactory.create("GeneratePdf");
        baseCommand.execute();
    }

    public void buttonSendXmlClicked() {
        //BaseCommand baseCommand = commandFactory.createAntPattern("GenerateXml");
        BaseCommand baseCommand = commandFactory.create("GenerateXml");
        baseCommand.execute();
    }
}
