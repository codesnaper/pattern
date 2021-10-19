package org.designpattern.structural.bridge;

import java.util.List;

public class ObjectFormatter implements Formatter{

    private List<Employee> employees ;

    public ObjectFormatter(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int getPageSize() {
        return this.employees.size();
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployees Information\n");
        this.employees.forEach(employee -> {
            sb.append(employee.toString());
        });
        return sb.toString();
    }
}
