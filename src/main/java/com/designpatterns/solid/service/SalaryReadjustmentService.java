package com.designpatterns.solid.service;

import com.designpatterns.solid.model.Employee;
import com.designpatterns.solid.validation.ValidateReadjust;

import java.math.BigDecimal;
import java.util.List;

public class SalaryReadjustmentService {

    private List<ValidateReadjust> validations;

    public SalaryReadjustmentService(List<ValidateReadjust> validations) {
        this.validations = validations;
    }

    public void readjustmentEmployeeSalary(final Employee employee, final BigDecimal plusSalary) {

        validations.forEach(v -> v.validate(employee, plusSalary));

        final BigDecimal newSalary = employee.getPersonalInformation().getSalary().add(plusSalary);
        employee.updateSalary(newSalary);
    }


}
