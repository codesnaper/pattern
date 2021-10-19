package org.designpattern.creational.prototype;

public class Appliance extends Product{

    private float amount;

    private String type;

    @Override
    public String toString() {
        return "Appliance{" +
                "id=" + getId() +
                ", type='" + getType() + '\'' +
                ", name='" + getName() + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
