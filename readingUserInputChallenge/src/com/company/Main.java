package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	int counter = 0;
	int sum = 0;

//	while(true) {
        while (counter < 10) {
	    int order = counter +1;
        System.out.println("Enter number #" + order + ":");

        boolean isAnInt = scanner.hasNextInt();

        if(isAnInt) {
        int number = scanner.nextInt();
        counter ++;
        sum += number;
//        if (counter == 10) {
//            break;
//            }
//            we only use the above if we use the while (true) instead of while (counter < 10)

        } else{
            System.out.println("Invalid Number");
        }

        scanner.nextLine();
    }
        System.out.println("Sum = " + sum);
	scanner.close();
    }
}
