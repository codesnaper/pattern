package org.designpattern.structural.composite;

public class MenuItem extends MenuComponent{

    public MenuItem(String dishName, double price) {
        this.dishname = dishName;
        this.price = price;
    }

    @Override
    protected String print() {
        return printMenu(this);
    }
}
