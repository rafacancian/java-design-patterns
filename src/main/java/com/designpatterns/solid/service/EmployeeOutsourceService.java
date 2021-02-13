package com.designpatterns.solid.service;

import com.designpatterns.solid.model.EmployeeOutsource;
import com.designpatterns.solid.model.PersonalInformation;
import com.designpatterns.solid.model.Position;

import java.math.BigDecimal;

public class EmployeeOutsourceService {

    public EmployeeOutsource create(String name, String cpf, Position position, BigDecimal salary) {
        PersonalInformation personalInformationOne = new PersonalInformation(name, cpf, position, salary);
        return new EmployeeOutsource(personalInformationOne, "Rafael Company LTDA");
    }

}
