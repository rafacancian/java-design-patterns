package com.designpatterns.solid.service;

import com.designpatterns.solid.exception.ValidateSalaryException;
import com.designpatterns.solid.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryReadjustment {

    public void readjustmentEmployeeSalary(final Employee employee, final BigDecimal plusSalary) {
        final BigDecimal currentSalary = employee.getSalary();
        final BigDecimal percentagePlus = plusSalary.divide(currentSalary, RoundingMode.HALF_UP);
        if (percentagePlus.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidateSalaryException("The readjustment can not be great then 40% of the salary");
        }
        final BigDecimal newSalary = currentSalary.add(plusSalary);
        employee.updateSalary(newSalary);
    }
}
