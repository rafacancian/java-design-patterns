package com.designpatterns.chainOfResponsibility.discount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class invoiceItems {

    private BigDecimal value;
    private int itemsQuantity;
}
