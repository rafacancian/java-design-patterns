package com.designpatterns.factory;

import java.util.Properties;

public class CommandExecution implements CommandFactory {

    public static final String PACKAGE = "com.designpatterns.factory.";
    Properties properties = new Properties();

    @Override
    public BaseCommand create() {
        try {
            Class classe = Class.forName("com.designpatterns.factory.CommandFactory.class");
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