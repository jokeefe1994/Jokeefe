package com.company;

public class Main {

    public static void main(String[] args) {
	Outlander outlander = new Outlander(36);
	outlander.steer(45);
	outlander.accelerate(20);
	outlander.accelerate(40);
	outlander.accelerate(-10);
    }
}
