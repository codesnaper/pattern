package org.designpattern.creational.builderpattern;

public class Run {

    public static void main (String[] args){
        LunchOrderMealSetter lunchOrderMealSetter = new LunchOrderMealSetter();
//        lunchOrderMealSetter.setBread("Naan");
//        lunchOrderMealSetter.setCurry("Veg Curry");
//        lunchOrderMealSetter.setDessert("Icecream");
//        lunchOrderMealSetter.setDrink("Coke");
        System.out.println(lunchOrderMealSetter.toString());
        LunchOrderMealConstructor mealConstructor = new LunchOrderMealConstructor("Naan","Paneer");
        System.out.println(mealConstructor.toString());

        LunchOrderMeal.Builder builder = new LunchOrderMeal.Builder();
        System.out.println(builder.bread("Naan").curry("Panner").drink("Coke").buildLunchMeal().toString());
    }


}
