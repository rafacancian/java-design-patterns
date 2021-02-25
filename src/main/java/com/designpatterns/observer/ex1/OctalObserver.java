package com.designpatterns.observer.ex1;

public class OctalObserver extends ObserverState {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer Octal: " + Integer.toOctalString(subject.getState()));
    }
}
