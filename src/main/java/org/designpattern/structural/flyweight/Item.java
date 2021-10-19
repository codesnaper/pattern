package org.designpattern.structural.flyweight;

//Entities for flyweight object .
//Class has extrinsic property (the class is stateless/ mutable)
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
