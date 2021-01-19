package com.designpatterns.factory;

public class CommandFactory {

    public static final String PACKAGE = "com.designpatterns.factory.";

    // Best way to instance a class with factory. Using reflection
    public BaseCommand create(String name) {
        try {
            Class classe = Class.forName(PACKAGE + name);
            Object object = classe.getDeclaredConstructor().newInstance();
            BaseCommand command = (BaseCommand) object;
            return command;
        } catch (Exception exception) {
            // do nothing
            return null;
        }
    }

    // Anti pattern - not recommended
    public BaseCommand createAntPattern(String className) {
        BaseCommand command = null;
        if (className.equals("GenerateEmail")) {
            command = new GenerateEmail();
        } else if (className.equals("GeneratePdf")) {
            command = new GeneratePdf();
        } else if (className.equals("GenerateXml")) {
            command = new GenerateXml();
        }
        return command;
    }
}