package org.designpattern.structural.bridge;

public class Employee {

    private String name;

    private String eid;

    private String number;

    public Employee(String name, String eid, String number) {
        this.name = name;
        this.eid = eid;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getEid() {
        return eid;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
