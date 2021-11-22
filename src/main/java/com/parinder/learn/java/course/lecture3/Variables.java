package com.parinder.learn.java.course.lecture3;

// Sequence - 1

/*
Variables are a way to store information in our machine.

There are lots of different types of data we can define for our variables. Collectively these are known as
DATA TYPES. As you may have guessed, data types are keyword in java.

Let's start out by defining a variable of type int - int being an abbreviation for integer, a whole number
(that is a number without any decimal points).
 */
public class Variables {
    public static void main(String[] args) {
        /*
    To define a variable we need to specify the data type (int), then give out our variable a name (myFirstVariable),
    and optionally add an expression (=) to initialize the variable with a value (5).

    Declaration Statement - Used to define a variable by indicating the data type, and the name, and optionally
    to set the variable to a certain value.
     */
        int myFirstVariable = 5;
        /*
        Any Sequence of characters surrounded by double quotes is a String literal in Java. It's value cannot be
        changed, unlike a variable
         */
        System.out.println("myFirstVariable");
        System.out.println(myFirstVariable);
    }
}