package org.designpattern.structural.composite;


public class Run {

    public static void main(String[] args){
        Menu beverageMenu = new Menu("BeverageMenu ",0);
        beverageMenu.addMenuComponent(new MenuItem("Beer", 503.32));
        beverageMenu.addMenuComponent(new MenuItem("Water", 20));
        beverageMenu.addMenuComponent(new MenuItem("Soda", 50));
        System.out.println(beverageMenu.print());
    }
}
