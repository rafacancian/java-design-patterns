package com.designpatterns.observer.ex1;

public class HexaObserver extends ObserverState {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer Hexa: " + Integer.toHexString(subject.getState()));
    }
}
