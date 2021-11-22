package com.parinder.learn.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputChallenge {

    // Take 10 integer inputs from user and store them in an array and print them on screen.

    public void storeAndPrintArrayInputs() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];

        for (int index = 0; index < inputArray.length; index++) {
            System.out.println("Enter the value of inputArray[" + index + "]");
            inputArray[index] = scanner.nextInt();
        }
        for (int index = 0; index < inputArray.length; index++) {
            System.out.println("Print the value of inputArray[" + index + "] is :" + inputArray[index]);
        }
    }

    // Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
    // Now, tell user whether that number is present in array or not.

    public void inputNumberPresentInArrayOrNot() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];

        for (int index = 0; index < inputArray.length; index++) {
            System.out.println("Enter the value of inputArray[" + index + "]");
            inputArray[index] = scanner.nextInt();
        }

        System.out.println("Enter the Random Number");
        int inputNumber = scanner.nextInt();

        for (int index = 0; index < inputArray.length; ) {
            int inputArrayNumber = inputArray[index];
            if (inputArrayNumber == inputNumber) {
                System.out.println("Number is Present");
                break;
            } else
                index++;
        }
        System.out.println("Number is not Present");
    }

    /*
    Take 5 integer inputs from user and print the following:
    number of positive numbers
    number of negative numbers
    number of odd numbers
    number of even numbers
    number of 0s.
     */

    public void getMultipleOperationsInInputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[5];
        int positiveNumbersCount = 0;
        int negativeNumbersCount = 0;
        int oddNumbersCount = 0;
        int evenNumberCount = 0;
        int zerosNumbersCount = 0;

        for (int index = 0; index < inputArray.length; index++) {
            System.out.println("Enter the value of inputArray[" + index + "]");
            inputArray[index] = scanner.nextInt();
        }

        for (int index = 0; index < inputArray.length; index++) {

            if (inputArray[index] > 0) {
                positiveNumbersCount++;
            } else if (inputArray[index] < 0) {
                negativeNumbersCount++;
            } else
                zerosNumbersCount++;

            if (inputArray[index] % 2 == 0) {
                evenNumberCount++;
            } else
                oddNumbersCount++;
        }
        System.out.println("Number of Zeros: " + zerosNumbersCount +
                "\n Number of Negative :" + negativeNumbersCount +
                "\n Number of Positive :" + positiveNumbersCount +
                "\n Number of Even :" + evenNumberCount +
                "\n Number of Odd :" + oddNumbersCount);
    }

    // Take 5 integer inputs from user and store them in an array.
    // Now, copy all the elements in an another array but in reverse order.

    public void getReverseArray() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[5];
        int[] reverseArray = new int[5];

        for (int index = 0; index < inputArray.length; index++) {
            System.out.println("Enter the value of inputArray[" + index + "]");
            inputArray[index] = scanner.nextInt();
        }
        System.out.println("Input Array is :" + Arrays.toString(inputArray));

        int inputArrayIndex = 0;
        for (int index = reverseArray.length-1; index >= 0; index--) {
            reverseArray[index] = inputArray[inputArrayIndex];
            inputArrayIndex++;
        }
        System.out.println("Reverse Array is :" + Arrays.toString(reverseArray));
    }

    public static void main(String[] args) {
        ArrayInputChallenge arrayInputChallenge = new ArrayInputChallenge();
        arrayInputChallenge.storeAndPrintArrayInputs();
        arrayInputChallenge.inputNumberPresentInArrayOrNot();
        arrayInputChallenge.getMultipleOperationsInInputArray();
        arrayInputChallenge.getReverseArray();
    }
}
