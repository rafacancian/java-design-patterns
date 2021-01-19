package com.designpatterns.observer;

public class BinaryObserver extends ObserverState {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
