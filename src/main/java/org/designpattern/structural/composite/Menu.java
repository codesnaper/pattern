package org.designpattern.structural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

    public Menu(String dishName, double price) {
        this.dishname = dishName;
        this.price = price;
    }

    public MenuComponent addMenuComponent(MenuComponent menuComponent){
        this.menuComponentList.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent removeMenuComponent(MenuComponent menuComponent){
        this.menuComponentList.remove(menuComponent);
        return menuComponent;
    }


    @Override
    protected String print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(printMenu(this));
        for (MenuComponent menuComponent : this.menuComponentList) {
            stringBuilder.append(menuComponent.print());
        }
        return stringBuilder.toString();
    }
}
