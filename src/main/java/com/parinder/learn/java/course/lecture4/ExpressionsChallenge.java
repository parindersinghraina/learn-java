package com.parinder.learn.java.course.lecture4;

// Sequence - 2

/*
we'll extend what we've done to using other variables in expressions.
To date we've used literal values in our expressions, and used operators such as in the example we ended up with
on line six, which is 10 plus five in parenthesis plus two times 10 in parenthesis.

int myFirstVariable = (10+5) + (2*10);

We need to declare two more variables, and I think it's time for a challenge to get you to do just that.
So the challenge is to create additional variables, two in fact. So we want to declare the following variables
and add them to our programme.
We want a variable called mySecondNumber which is an int, and you want to assign a value of 12 to that variable.
The second variable to create is called myThirdNumber, also of type int and assign a value six to that.
So put the declaration statements above the system.out.println. And add all of them.

 */
public class ExpressionsChallenge {
    public static void main(String[] arg) {

        int myFirstVariable = (10 + 5) + (2 * 10);
        int mySecondVariable = 12;
        int myThirdVariable = 6;
        int myTotal = myFirstVariable + mySecondVariable + myThirdVariable;

        System.out.println(myTotal);
    }
}
