package com.designpatterns.solid.service;

import com.designpatterns.solid.model.Employee;

import java.math.BigDecimal;

public interface ValidateReadjust {

    void validate(Employee employee, BigDecimal plusSalary);
}
