package com.parinder.learn.java.course.lecture6;

/*
So in Java, primitive types are the most basic data types. An int is one of eight different primitive types.
The eight primitive data types in Java are
boolean,
byte,
char,
short,
int,
long,
float,
and
double.
So consider these types as the building blocks of data manipulation. So let's explore the eight primitive types in Java
 */

public class PrimitiveTypes {
    public static void main(String[] args) {

        // Integer
        int myIntValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        // This is a concept called Overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        // This is a concept called Underflow this time and not Overflow.
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        /*
        So what's happening is the computer just skips back to the minimum number or the maximum number,
        which is usually not what you want. So it's an important concept to be aware of. So clearly here Overflow
        and Underflow is a bad thing. We don't want that happening with our code.

        As we'll see in the next lecture, there's a data type to hold much bigger numbers if we need them.
        But ultimately, as a programmer, it's our responsibility to use the appropriate data type and ensure the
        range of numbers we're trying to store in that data type is within the range.
         */

        // Byte & Short

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        /*
        All right, so I wanna talk about the size of primitives types, and what width means.
        So a byte occupies eight bits. Now a bit is not directly represented in a primitive type. We have a Boolean,
        which is not really the same thing, and that we'll discuss in a future video.
        But we could just assume that a byte occupies eight bits. Now we can say, therefore, that a byte has a
        width of eight.

        Now a short, on the other hand, we saw that it can store a larger range of numbers, and for that reason it
        occupies 16 bits, and has a width of, therefore, 16. Now an integer has a much larger range, as we saw again,
        compared to the byte and the short.

        While that occupies 32 bits, it has a width of 32. So the point here is that each primitive type
        occupies a different amount of memory. We can see that an int now needs four times the amount of space
        that a byte does, as an example.

        Now it's not particularly relevant for you to know these numbers, but suddenly they could come up
        as an interview question, and it's useful to know, in general, that certain data types take up more
        space than others.

        All right, so there's one more data type, and that's of use for you where you've got a number
        that you wanna process that's larger than the amount for an int.

        So we call that one the long. So let's go ahead and add some code for that.
         */

        // Long

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("myLongValue = " + myLongValue);
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
    }
}
