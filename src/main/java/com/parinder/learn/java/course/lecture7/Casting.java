package com.parinder.learn.java.course.lecture7;

/*
Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis
like this:

(byte) (myMinByteValue/2)

Other language have casting, this is not just Java.
 */
public class Casting {

    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteValue = (byte) (myMinByteValue / 2); // By default, under parenthesis() java consider the number as Integer.

        System.out.println("Casted Byte Value is : " + myMinByteValue);
    }
}
