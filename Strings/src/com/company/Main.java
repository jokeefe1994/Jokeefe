package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to" + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to" + myString);
        String numberString = "250.55";
        numberString = numberString + " + 49.95";
        System.out.println(numberString);
        double myStringAnswer = 250.55 + 49.95;
        System.out.println("The Answer to the above solution is " + myStringAnswer);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString +myInt;
        System.out.println("Last String is equal to " + lastString);

    }
}
