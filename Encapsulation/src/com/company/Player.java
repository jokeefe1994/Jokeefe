package com.company;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
