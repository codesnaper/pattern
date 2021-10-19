package org.designpattern.structural.flyweight;

//Class is not immutable/ it has intrinsic property (status)
public class Order {

    private final Item item;

    private final int orderNo;

    private String status = "Processing";

    public Order(Item item, int orderNo) {
        this.item = item;
        this.orderNo = orderNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Item getItem() {
        return item;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", orderNo=" + orderNo +
                ", status='" + status + '\'' +
                '}';
    }
}
