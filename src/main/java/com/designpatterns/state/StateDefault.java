package com.designpatterns.state;

import com.designpatterns.state.exceptions.StateException;
import lombok.Data;

@Data
public abstract class StateDefault {

    public abstract void execute();

    public void created(Order order) {
        throw new StateException("State cannot be change to Created");
    }

    public void approved(Order order) {
        throw new StateException("State cannot be change to Approved");
    }

    public void finished(Order order) {
        throw new StateException("State cannot be change to Finished");
    }
}
