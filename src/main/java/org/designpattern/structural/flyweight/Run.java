package org.designpattern.structural.flyweight;

public class Run {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.takeOrder("Bose headphone", 1);
        catalog.takeOrder("MI TV", 2);
        catalog.takeOrder("Bose headphone", 3);
        catalog.takeOrder("Bose headphone", 4);
        catalog.takeOrder("MI TV", 5);
        catalog.takeOrder("Laptop", 6);
        System.out.println(catalog.printOrder());
        System.out.println(catalog.printItem());
        System.out.println(String.format("Total Item is %d",catalog.getItemSize()));
    }
}
