package org.designpattern.structural.adapter;

public interface Employee {

    String getName();

    String getEid();

    String getNumber();

    default String print(){
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", eid='" + getEid() + '\'' +
                ", number='" + getNumber() + '\'' +
                '}';
    }
}
