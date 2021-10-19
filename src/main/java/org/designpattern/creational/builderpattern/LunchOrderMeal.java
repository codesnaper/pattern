package org.designpattern.creational.builderpattern;

public class LunchOrderMeal {

    public static class Builder{
        private String bread;

        private String curry;

        private String dessert;

        private String drink;

        public LunchOrderMeal buildLunchMeal(){
            return new LunchOrderMeal(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return  this;
        }

        public Builder curry(String curry){
            this.curry = curry;
            return this;
        }

        public Builder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }

    }

    private final String bread;

    private final String curry;

    private final String dessert;

    private final String drink;

    public LunchOrderMeal(Builder builder) {
        this.bread = builder.bread;
        this.curry = builder.curry;
        this.dessert = builder.dessert;
        this.drink = builder.drink;
    }

    @Override
    public String toString() {
        return "LunchOrderMeal{" +
                "bread='" + bread + '\'' +
                ", curry='" + curry + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
