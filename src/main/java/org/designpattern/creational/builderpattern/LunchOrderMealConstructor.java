package org.designpattern.creational.builderpattern;

public class LunchOrderMealConstructor {

    private String bread;

    private  String curry;

    @Override
    public String toString() {
        return "LunchOrderMealConstructor{" +
                "bread='" + bread + '\'' +
                ", curry='" + curry + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }

    private String dessert;

    private String drink;


    public LunchOrderMealConstructor(String bread) {
        this.bread = bread;
    }

    public LunchOrderMealConstructor(String bread, String curry) {
        this.bread = bread;
        this.curry = curry;
    }

    public LunchOrderMealConstructor(String bread, String curry, String dessert) {
        this.bread = bread;
        this.curry = curry;
        this.dessert = dessert;
    }

    public LunchOrderMealConstructor(String bread, String curry, String dessert, String drink) {
        this.bread = bread;
        this.curry = curry;
        this.dessert = dessert;
        this.drink = drink;
    }

    public String getBread() {
        return bread;
    }

    public String getCurry() {
        return curry;
    }

    public String getDessert() {
        return dessert;
    }

    public String getDrink() {
        return drink;
    }
}
