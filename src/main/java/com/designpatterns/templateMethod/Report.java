package com.designpatterns.templateMethod;

public abstract class Report {

    public void createReport() {
        createHeader();
        createBody();
        createFooter();
    }

    public abstract void createHeader();

    public abstract void createBody();

    public abstract void createFooter();
}
