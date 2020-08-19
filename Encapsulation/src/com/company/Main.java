package com.company;

public class Main {

    public static void main(String[] args) {
//	Player player = new Player();
//	player.name ="James";
//	player.health = 20;
//	player.weapon = "Sword";
//
//	int damage = 10;
//	player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//		player.looseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("James", 50, "sword");
		System.out.println("Initial health is " + player.getHealth());

    }
}
