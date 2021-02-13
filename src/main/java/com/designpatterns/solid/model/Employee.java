package com.designpatterns.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private PersonalInformation personalInformation;
    private LocalDate lastUpdateSalary;


    public Employee(PersonalInformation personalInformation, LocalDate lastUpdateSalary) {
        this.personalInformation = personalInformation;
        this.lastUpdateSalary = lastUpdateSalary;
    }

    public void updateSalary(BigDecimal newSalary) {
        personalInformation.updateSalary(newSalary);
        this.lastUpdateSalary = LocalDate.now();
    }

    public void promote(Position newPosition) {
        personalInformation.promote(newPosition);
    }

    public LocalDate getLastUpdateSalary() {
        return lastUpdateSalary;
    }

    public void setLastUpdateSalary(LocalDate lastUpdateSalary) {
        this.lastUpdateSalary = lastUpdateSalary;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalInformation=" + personalInformation +
                ", lastUpdateSalary=" + lastUpdateSalary +
                '}';
    }
}

