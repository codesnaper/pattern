package org.designpattern.creational.prototype;

public enum Type {
    APPLIANCE("appliance"), ELECTRONIC("elec");

    private final String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
