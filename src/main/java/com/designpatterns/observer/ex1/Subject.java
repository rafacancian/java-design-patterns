package com.designpatterns.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<ObserverState> observerStateList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        observerStateList.forEach(ObserverState::update);
    }

    public void attach(ObserverState observerState) {
        observerStateList.add(observerState);
    }
}
