package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger( String meat, double price) {
        super("HealthyBurger", meat, "Rye Bread", price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();

        if (this.healthyAddition1Name != null) {
            healthyBurgerPrice += this.healthyAddition1Price;
            System.out.println(this.healthyAddition1Name + " added for an extra" + this.healthyAddition1Price);
        }

        if (this.healthyAddition2Name != null) {
            healthyBurgerPrice += this.healthyAddition2Price;
            System.out.println(this.healthyAddition2Name + " added for an extra" + this.healthyAddition2Price);
        }
        return healthyBurgerPrice;
    }
}
