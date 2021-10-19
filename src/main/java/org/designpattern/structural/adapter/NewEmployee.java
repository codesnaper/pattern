package org.designpattern.structural.adapter;

public class NewEmployee {

    private String employeeName;

    private String phoneNumber;

    public NewEmployee(String employeeName, String phoneNumber) {
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
