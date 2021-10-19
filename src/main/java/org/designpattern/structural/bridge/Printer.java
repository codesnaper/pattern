package org.designpattern.structural.bridge;

public abstract class Printer {

    Formatter formatter;

    public Printer(Formatter formatter){
        this.formatter = formatter;
    }

    public abstract String printerConnection();

    public void print(){
        System.out.println("Connecting on printer >> "+ printerConnection());
        System.out.println(String.format("Content >> %s \nPageSize >> %d",this.formatter.getContent(),this.formatter.getPageSize()));
    }
}
