package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readIntegers(5);
        printArray(myArray);
        findMin(myArray);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values:" + "\r");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        } return array;

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has a value of " + array[i]);
        }
    }

    public static int findMin(int[] array) {
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minInt) {
                minInt = array[i];
            }
        } System.out.println("Min Array Value is " + minInt);
        return minInt;
    }

//    public static int findMin(int[] array) {
//        boolean flag = true;
//        int temp = 0;
//
//        while(flag) {
//            flag = false;
//            for (int i = 0; i < array.length-1; i++) {
//                if (array[i] > array[i+1]) {
//                    temp = array[i];
//                   array[i] = array[i+1];
//                   array[i+1] = temp;
//                    flag = true;
//                }
//            }System.out.println("Min Integer value is " + array[0]);
//
//        } return array[0];
//
//    }
}
