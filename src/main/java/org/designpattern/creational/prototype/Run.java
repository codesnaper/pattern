package org.designpattern.creational.prototype;

import java.util.Random;

public class Run {

    public static void main(String[] args){
        ProductRegistry productRegistry = new ProductRegistry();
        Appliance appliance = (Appliance) productRegistry.createProduct(Type.APPLIANCE);
        appliance.setName("Washing Machine");
        appliance.setAmount(1000);
        System.out.println(appliance.toString());
        for(int inc =0; inc< 1000; inc++){
            Electronics electronics = (Electronics) productRegistry.createProduct(Type.ELECTRONIC);
            electronics.setName("Mobile-"+inc);
            electronics.setPrice(new Random(10).nextInt() * inc);
            electronics.setId(inc);
            System.out.println(electronics.toString());
        }
    }
}

