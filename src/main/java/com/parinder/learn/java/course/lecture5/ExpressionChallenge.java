package com.parinder.learn.java.course.lecture5;

/*
So your challenge is to create a new variable  and call it myLastOne, with the value to be 1000 less the current
value of myTotal, and the data type should also be an int. And then you want to print out the value of myLastOne
on the line after you declare it.

Now as a hint here, we need to use another operator that we haven't actually used in the code before,
but if you think about this, it should be easy to figure out which operator you need to use for this.
 */

public class ExpressionChallenge {
    public static void main(String[] args) {
        int myFirstVariable = (10 + 5) + (2 * 10);
        int mySecondVariable = 12;
        int myThirdVariable = 6;
        int myTotal = myFirstVariable + mySecondVariable + myThirdVariable;
        System.out.println(myTotal);

        int myLastVariable = 1000 - myTotal;
        System.out.println(myLastVariable);
    }
}
