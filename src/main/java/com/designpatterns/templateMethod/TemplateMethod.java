package com.designpatterns.templateMethod;

public class TemplateMethod {

    Report report = new Report() {

        @Override
        public void createHeader() {
            System.out.println("Report - create header");
        }

        @Override
        public void createBody() {
            System.out.println("Report - create body");
        }

        @Override
        public void createFooter() {
            System.out.println("Report - create footer");
        }

    };
}
