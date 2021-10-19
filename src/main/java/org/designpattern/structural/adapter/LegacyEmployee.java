package org.designpattern.structural.adapter;

public class LegacyEmployee implements Employee{

    private String name;

    private String eid;

    private String number;

    public LegacyEmployee(String name, String eid, String number) {
        this.name = name;
        this.eid = eid;
        this.number = number;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEid() {
        return this.eid;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "LegacyEmployee{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
