package org.designpattern.structural.bridge;

public class OnlinePrinter extends Printer{

    public OnlinePrinter(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String printerConnection() {
        return "Online Printer";
    }
}
