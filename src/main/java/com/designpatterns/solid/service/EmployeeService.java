package com.designpatterns.solid.service;

import com.designpatterns.solid.model.Employee;
import com.designpatterns.solid.model.PersonalInformation;
import com.designpatterns.solid.model.Position;
import com.designpatterns.solid.validation.ValidateReadjust;
import com.designpatterns.solid.validation.ValidateReadjustFrequencyAllow;
import com.designpatterns.solid.validation.ValidateReadjustPercentAllow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<ValidateReadjust> validations;
    SalaryReadjustmentService salaryReadjustmentService;
    PromoteEmployeeService promoteEmployeeService;

    public EmployeeService() {

        this.validations = new ArrayList<>();
        validations.add(new ValidateReadjustPercentAllow());
        validations.add(new ValidateReadjustFrequencyAllow());

        salaryReadjustmentService = new SalaryReadjustmentService(validations);
        promoteEmployeeService = new PromoteEmployeeService();
    }

    public Employee create(String name, String cpf, Position position, BigDecimal salary, LocalDate localDate) {
        PersonalInformation personalInformationOne = new PersonalInformation(name, cpf, position, salary);
        return new Employee(personalInformationOne, localDate);
    }

    public void updateSalary(Employee employee, BigDecimal plushSalary) {
        salaryReadjustmentService.readjustmentEmployeeSalary(employee, plushSalary);
    }

    public void promote(Employee employee, boolean deservePromotion) {
        promoteEmployeeService.execute(employee, deservePromotion);
    }


}
