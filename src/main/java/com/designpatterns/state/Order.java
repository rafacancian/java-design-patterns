package com.designpatterns.state;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Order {

    Order() {
        state = new StateCreated();
        value = BigDecimal.ZERO;
        code = UUID.randomUUID().toString().substring(0, 5);
    }

    private String code;
    private BigDecimal value;
    private StateDefault state;

    public void created() {
        this.state.created(this);
    }

    public void approved() {
        this.state.approved(this);
    }

    public void finished() {
        this.state.finished(this);
    }

}
