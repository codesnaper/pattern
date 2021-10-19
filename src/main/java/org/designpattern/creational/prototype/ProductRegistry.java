package org.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {

    private final Map<String, Product> registryMap = new HashMap<>();

    public ProductRegistry() {
        loadDefaultItem();
    }

    public Product createProduct(Type type){
        if(this.registryMap.containsKey(type.getName())){
            return this.registryMap.get(type.getName());
        } else{
            throw new IllegalStateException("Unexpected Type. Not found in registry: " + type);
        }
    }

    private void loadDefaultItem(){
        Appliance appliance = new Appliance();
        appliance.setId(1);
        appliance.setType("Kitchen");
        appliance.setName("Default");
        appliance.setAmount(0);
        appliance.setType("Default Type");
        registryMap.put(Type.APPLIANCE.getName(),appliance);
        Electronics electronics = new Electronics();
        electronics.setId(1);
        electronics.setName("Default");
        electronics.setType("Default Type");
        electronics.setPrice(0);
        registryMap.put(Type.ELECTRONIC.getName(), electronics);
    }
}
