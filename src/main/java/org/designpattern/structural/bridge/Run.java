package org.designpattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("Shubham","1","1234");
        employees.add(employee);
        Formatter formatter = new HTMLFormatter(employees);
        Printer printer1 = new Printer1(formatter);
        printer1.print();
        Printer onlinePrinter = new OnlinePrinter(formatter);
        onlinePrinter.print();
        Formatter objectFormatter = new ObjectFormatter(employees);
        printer1 = new Printer1(objectFormatter);
        printer1.print();
    }
}
