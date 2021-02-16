package com.designpatterns.solid;

import com.designpatterns.solid.model.Employee;
import com.designpatterns.solid.model.EmployeeOutsource;
import com.designpatterns.solid.model.Position;
import com.designpatterns.solid.service.EmployeeOutsourceService;
import com.designpatterns.solid.service.EmployeeService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SolidExecute {

    /**
     * SOLID
     * - Single Responsibility Principle
     * - Open Closed Principle
     * - Liskov Substitution Principle
     * - Interface Segregation Principle
     * - Dependency Inversion Principle
     * <p>
     * É interessante e mais seguro para o nosso código depender de interfaces
     * (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe
     * <p>
     * As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento
     * <p>
     * O Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e
     * abstrações não devem depender de implementações
     * <p>
     * As interfaces devem definir apenas os métodos que fazem sentido para seu contexto
     * <p>
     * O Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa
     */

    public static void execute() {

        EmployeeService employeeService = new EmployeeService();
        EmployeeOutsourceService employeeOutsourceService = new EmployeeOutsourceService();

        Employee employee = employeeService.create(
                "Rafael Cancian", "123.123.123.12", Position.ANALYST, new BigDecimal("2000.00"),
                LocalDate.of(2020, Month.JANUARY, 20));
        System.out.println(employee);
        employeeService.updateSalary(employee, new BigDecimal("200.00"));
        employeeService.promote(employee, true);
        System.out.println(employee);

        EmployeeOutsource outsourceEmployee = employeeOutsourceService.create(
                "Rafael Company LTDA", "233.233.233.23", Position.MANAGER, new BigDecimal("4000.00"));
        System.out.println(outsourceEmployee);
    }

}
