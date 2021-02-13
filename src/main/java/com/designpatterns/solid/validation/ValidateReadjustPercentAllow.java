package com.designpatterns.solid.validation;

import com.designpatterns.solid.exception.ValidateSalaryException;
import com.designpatterns.solid.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidateReadjustPercentAllow implements ValidateReadjust {

    @Override
    public void validate(Employee employee, BigDecimal plusSalary) {
        final BigDecimal currentSalary = employee.getPersonalInformation().getSalary();
        final BigDecimal percentagePlus = plusSalary.divide(currentSalary, RoundingMode.HALF_UP);
        if (percentagePlus.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidateSalaryException("The readjustment can not be great then 40% of the salary");
        }
    }
}
