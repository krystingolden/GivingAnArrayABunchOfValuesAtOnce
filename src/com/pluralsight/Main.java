package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/
    Giving an array a bunch of values at once - Assignment #150
     */

    public static void main(String[] args) {

        String[] stringArray = {"alpha", "bravo", "charlie", "delta", "echo"};

        System.out.print("The first array is filled with the following values:\n\t");
        for (int i = 0; i < stringArray.length; i++)
            System.out.print(stringArray[i] + " ");
        System.out.println();

        Integer[] integerArray = {11, 23, 37, 41, 53};

        System.out.print("The second array is filled with the following values:\n\t");
        for (int i = 0; i < integerArray.length; i++)
            System.out.print(integerArray[i] + " ");
        System.out.println();

    }
}
