package com.company;

public class Main {

    public static void main(String[] args) {

            int myValue = 10000;

            int myMinValue = Integer.MIN_VALUE;
            int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinValue);
        System.out.println("Integer Maximum Value =" + myMaxValue);
        System.out.println("Busted Max Value =" + (myMaxValue + 1));
        System.out.println("Busted Min Value =" + (myMinValue -1));

        int myMaxTest = 2_147_483_647;

        byte myMinByteValue = (Byte.MIN_VALUE);
        byte myMaxByteValue = (Byte.MAX_VALUE);
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        short myMinShortValue = (Short.MIN_VALUE);
        short myMaxShortValue = (Short.MAX_VALUE);
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = (Long.MIN_VALUE);
        long myMaxLongValue = (Long.MAX_VALUE);
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);



            byte myByteNumber = 112;
            short myShortNumber = 15789;
            int myIntNumber = 12_200_675;

            long myLongChallenge = 50_000 + 10 * (myByteNumber + myShortNumber + myIntNumber);

            System.out.println(myLongChallenge);


    }

