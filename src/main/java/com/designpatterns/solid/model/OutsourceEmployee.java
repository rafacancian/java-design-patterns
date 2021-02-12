package com.designpatterns.solid.model;

import java.math.BigDecimal;

public class OutsourceEmployee extends Employee {

    private String companyName;

    public OutsourceEmployee(String name, String cpf, Position position, BigDecimal salary) {
        super(name, cpf, position, salary);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
