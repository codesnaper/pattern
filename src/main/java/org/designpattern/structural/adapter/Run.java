package org.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        LegacyEmployee employee = new LegacyEmployee("Shubham","1","000994023");
        employees.add(employee);
        NewEmployee newEmployee = new NewEmployee("Shubham","98439785");
//        employees.add(newEmployee);
        employees.add(new EmployeeAdapter(newEmployee));
        employees.stream().forEach(employee1 -> System.out.println(employee1.print()));
    }
}
