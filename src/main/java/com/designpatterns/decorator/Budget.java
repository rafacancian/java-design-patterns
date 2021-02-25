package com.designpatterns.decorator;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Budget {

    String code;
    BigDecimal value;
}
