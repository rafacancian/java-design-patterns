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
