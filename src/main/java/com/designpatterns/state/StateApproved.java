package com.designpatterns.state;

import lombok.Data;

@Data
public class StateApproved extends StateDefault {

    @Override
    public void execute() {
        System.out.println("execute operation related to status Approved");
    }

    @Override
    public void finished(Order order) {
        order.setState(new StateFinished());
    }
}
