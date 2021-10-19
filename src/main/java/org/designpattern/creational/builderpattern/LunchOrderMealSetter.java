package org.designpattern.creational.builderpattern;

public class LunchOrderMealSetter {

    private String bread;

    private String curry;

    private String dessert;

    private String drink;

    @Override
    public String toString() {
        return "LunchOrderMealSetter{" +
                "bread='" + bread + '\'' +
                ", curry='" + curry + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
