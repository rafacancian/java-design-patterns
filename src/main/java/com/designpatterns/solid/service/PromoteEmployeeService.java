package com.designpatterns.solid.service;

import com.designpatterns.solid.exception.ValidatePromotionException;
import com.designpatterns.solid.model.Employee;
import com.designpatterns.solid.model.Position;

public class PromoteEmployeeService {

    public void execute(Employee employee, boolean deservePromotion) {
        Position actualPosition = employee.getPosition();

        if (Position.MANAGER == actualPosition) {
            throw new ValidatePromotionException("Manager can not be promoted");
        }

        if (deservePromotion) {
            Position nextPosition = actualPosition.nextPosition();
            employee.Promote(nextPosition);
        }

    }
}
