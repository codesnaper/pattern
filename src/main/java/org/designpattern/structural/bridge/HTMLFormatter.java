package org.designpattern.structural.bridge;

import java.util.List;

public class HTMLFormatter implements Formatter{

    private List<Employee> employees;

    public HTMLFormatter(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int getPageSize() {
        return employees.size();
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n<html><body><h1>Employees Information</h1><ul>");
        this.employees.forEach(employee -> {
            sb.append("<ol>");
            sb.append(String.format("<p>Employee Name : <b>%s</b>",employee.getName()));
            sb.append(String.format("<p>Employee Id : <b>%s</b>",employee.getEid()));
            sb.append(String.format("<p>Employee Number : <b>%s</b>",employee.getNumber()));
        });
        sb.append("</ul></body></html>");
        return sb.toString();
    }
}
