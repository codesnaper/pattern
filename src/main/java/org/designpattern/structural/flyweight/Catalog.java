package org.designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Class act as factory and cache for item flyweight objects.
public class Catalog {

    private final Map<String, Item> itemMap = new HashMap<>();

    private List<Order> order = new ArrayList<>();
    private Item lookUp(String itemName){
        if (!itemMap.containsKey(itemName)) {
            itemMap.put(itemName, new Item(itemName));
        }
        return itemMap.get(itemName);
    }

    public Order takeOrder(String itemName, int orderNo){
        Order order1 = new Order(lookUp(itemName),orderNo);
        order.add(order1);
        return order1;
    }

    public int getItemSize(){
        return this.itemMap.size();
    }

    public String printItem(){
        StringBuilder stringBuilder = new StringBuilder(String.format("******\nItem size >> %d . \nItem >>>>>\n",itemMap.size()));
        for(String name: itemMap.keySet()){
            stringBuilder.append(itemMap.get(name).toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public String printOrder(){
        StringBuilder stringBuilder = new StringBuilder(String.format("******\nOrder size >> %d . \nOrder >>>>>\n",order.size()));
        this.order.forEach(order1 -> {
            stringBuilder.append(order1.toString()+"\n");
        });
        return stringBuilder.toString();
    }


}
