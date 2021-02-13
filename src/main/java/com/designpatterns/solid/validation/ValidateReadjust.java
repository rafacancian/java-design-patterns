package com.designpatterns.solid.validation;

import com.designpatterns.solid.model.Employee;

import java.math.BigDecimal;

public interface ValidateReadjust {

    void validate(Employee employee, BigDecimal plusSalary);
}
