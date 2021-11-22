package com.parinder.learn.java.arrays;

/*
An array is a group of like-typed variables that are referred to by a common name.
Arrays of any type can be created and may have one or more dimensions.
A specific element in an array is accessed by its index.
*/
public class Arrays {

    /*
    A one-dimensional array is, essentially, a list of like-typed variables. To create an array,
    you first must create an array variable of the desired type.
    The general form of a one-dimensional array declaration is

    type var-name[ ]; - C style array declaration
    type[] var-name; - Java Style Array Declaration
     */
    public void oneDimensionalArray() {
        // The following declares an array named monthDays with the type “array of int”:
        int[] monthDays;

        /*
        Although this declaration establishes the fact that month_days is an array variable,
        no array actually exists.
        To link monthDays with an actual, physical array of integers,
        you must allocate one using new and assign it to monthDays.
        new is a special operator that allocates memory.

        array-var = new type [size];

        Here, type specifies the type of data being allocated, size specifies the number of elements in the array,
        and array-var is the array variable that is linked to the array.
         */

        // In this example allocates a 12-element array of integers and links them to monthDays:
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        System.out.println("Feb. has " + monthDays[1] + " days");
    }

    // An improved version of the above method.An array initializer is a list of comma-separated
    // expressions surrounded by curly braces.

    public void improvedOneDimensionalArray() {
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Feb. has " + monthDays[1] + " days");
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.oneDimensionalArray();
        arrays.improvedOneDimensionalArray();
    }
}
