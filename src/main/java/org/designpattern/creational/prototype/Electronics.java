package org.designpattern.creational.prototype;

public class Electronics extends Product{

    private float price;

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + getId() +
                ", type='" + getType() + '\'' +
                ", name='" + getName() + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
