package org.designpattern.structural.bridge;

public class Printer1 extends Printer{

    public Printer1(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String printerConnection() {
        return "Printer 1";
    }

}
