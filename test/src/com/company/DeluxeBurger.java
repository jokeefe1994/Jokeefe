package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String meat, String breadRollType, double price) {
        super("Deluxe Burger", "Beef", "White Roll", 5.75);
        super.addAddition1("Fries", 2.00);
        super.addAddition2("Drink", 1.50);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add any additions to Deluxe Burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add any additions to Deluxe Burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add any additions to Deluxe Burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add any additions to Deluxe Burger");
    }
}
