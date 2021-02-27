package com.designpatterns.observer.ex1;

public class ExampleObserverNumberConverter {

    public static void execute() {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}
