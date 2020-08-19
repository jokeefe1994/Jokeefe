package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = (Float.MIN_VALUE);
        float myMaxFloatValue = (Float.MAX_VALUE);
        System.out.println("Float minimum value=" + myMinFloatValue);
        System.out.println("Float maximum value=" + myMaxFloatValue);


        double myMinDoubleValue = (Double.MIN_VALUE);
        double myMaxDoubleValue = (Double.MAX_VALUE);
        System.out.println("Double minimum value=" + myMinDoubleValue);
        System.out.println("Double maximum value=" + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue =" + myIntValue);
        System.out.println(("MyFloatValue =" + myFloatValue));
        System.out.println("MyDoubleValue =" + myDoubleValue);

        float yazWeightInPounds = 115;
        float myConversion = (float) .45359237;
        float yazWeightInKilos = yazWeightInPounds * myConversion;

        System.out.println("Yasemin's Weight in Kilos=" + yazWeightInKilos + "kg");

    }
}
