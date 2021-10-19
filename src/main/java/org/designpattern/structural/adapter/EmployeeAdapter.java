package org.designpattern.structural.adapter;

import java.util.Random;

public class EmployeeAdapter implements Employee{

    private NewEmployee newEmployee;

    public EmployeeAdapter(NewEmployee newEmployee) {
        this.newEmployee = newEmployee;
    }

    @Override
    public String getName() {
        return this.newEmployee.getEmployeeName();
    }

    @Override
    public String getEid() {
        return new Random().toString();
    }

    @Override
    public String getNumber() {
        return this.newEmployee.getPhoneNumber();
    }


}
