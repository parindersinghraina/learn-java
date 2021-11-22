package com.parinder.learn.java.arrays;

import java.util.Arrays;

public class ArraysChallenge {

    // Average an array of values.
    public int getAverageArray(int[] inputArray) {
        int[] avgArray = inputArray;
        int avgResult = 0;
        int index;

        for (index = 0; index < avgArray.length; index++) {
            avgResult = avgResult + avgArray[index];
        }
        System.out.println("Average is :" + avgResult / avgArray.length);
        return avgResult / avgArray.length;
    }

    // Return Array with addition of 10 each element
    public String getArrayWithAddition(int[] inputArray) {
        int[] newAdditionArray = new int[inputArray.length];
        int number;

        for (int index = 0; index < inputArray.length; index++) {
            number = inputArray[index] + 10;
            newAdditionArray[index] = number;
        }
        return Arrays.toString(newAdditionArray);
    }

    // Check the number is present in array or not.
    public boolean numberIsPresentOrNot(int[] inputArray, int number) {
        Boolean result = null;
        for (int index = 0; index < inputArray.length; ) {
            int inputArrayNumber = inputArray[index];
            if (inputArrayNumber == number) {
                result = true;
                System.out.println("Number is Present");
                break;
            } else
                index++;
            result = false;
        }
        System.out.println("Number is not Present");
        return result;
    }

    // Print the return array by getArrayWithAddition
    public String getReturnArrayString(int[] inputArray) {
        return this.getArrayWithAddition(inputArray);
    }

    // Get the Reverse array
    public String getReverseOfArray(int[] inputArray){
        int inputArrayIndex = 0;
        int[] reverseArray= new int[inputArray.length];

        for (int index = reverseArray.length-1; index >= 0; index--) {
            reverseArray[index] = inputArray[inputArrayIndex];
            inputArrayIndex++;
        }
        System.out.println("Reverse Array is :" + Arrays.toString(reverseArray));
        return  Arrays.toString(reverseArray);
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 11, 12, 13, 14, 15};
        ArraysChallenge arraysChallenge = new ArraysChallenge();
        arraysChallenge.getAverageArray(inputArray);
        arraysChallenge.getReturnArrayString(inputArray);
        arraysChallenge.numberIsPresentOrNot(inputArray, 20);
        arraysChallenge.getReverseOfArray(inputArray);
    }
}
