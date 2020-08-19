package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = {2, 45, 23, 96, 3, 86, 19};
        System.out.println("Array before reverse is in the order of: " + Arrays.toString(array));
	reverse(array);
    }

    public static void reverse(int[] array) {
        int count = array.length-1;
        int temp;
        for (int i = 0; i < array.length/2; i++) {
                temp = array[i + count];
                array[i + count] = array[i];
                array[i] = temp;
                count -=2;
            }

//        }
        System.out.println("Array after reversal is in the order of: " + Arrays.toString(array));

    }
}
