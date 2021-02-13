package com.designpatterns.solid.model;

import java.math.BigDecimal;

public class PersonalInformation {

    private String name;
    private String cpf;
    private Position position;
    private BigDecimal salary;

    public PersonalInformation(String name, String cpf, Position position, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.position = position;
        this.salary = salary;
    }

    public void updateSalary(BigDecimal newSalary) {
        this.salary = newSalary;
    }

    public void promote(Position newPosition) {
        this.position = newPosition;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Position getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
