package com.designpatterns.state;

import lombok.Data;

@Data
public class StateFinished extends StateDefault {

    @Override
    public void execute() {
        System.out.println("execute operation related to status Finished");
    }

}
