package com.designpatterns.state;

import lombok.Data;

@Data
public class StateCreated extends StateDefault {

    @Override
    public void execute() {
        System.out.println("execute operation related to status Created");
    }


    @Override
    public void approved(Order order) {
        order.setState(new StateApproved());
    }

}
