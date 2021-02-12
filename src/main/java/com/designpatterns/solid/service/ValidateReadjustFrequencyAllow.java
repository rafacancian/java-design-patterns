package com.designpatterns.solid.service;

import com.designpatterns.solid.exception.ValidateSalaryException;
import com.designpatterns.solid.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidateReadjustFrequencyAllow implements ValidateReadjust {

    @Override
    public void validate(Employee employee, BigDecimal plusSalary) {
        final LocalDate lastReadjustingDate = employee.getLastUpdateSalary();
        final LocalDate today = LocalDate.now();
        final long monthLastReadjust = ChronoUnit.MONTHS.between(lastReadjustingDate, today);
        if (monthLastReadjust > 6) {
            throw new ValidateSalaryException("It is not possible to give readjusting in a interval less than 6 month");
        }
    }

}
