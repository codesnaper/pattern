package org.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    protected String dishname;

    protected double price;

    protected List<MenuComponent> menuComponentList = new ArrayList<>();

    protected abstract String print();

    String printMenu(MenuComponent menuComponent){
        StringBuilder sb = new StringBuilder();
        sb.append("\n *** MENU ***");
        sb.append(String.format("Dish name : %s   ......    Price: %f", dishname,price));
        return sb.toString();
    }
}
