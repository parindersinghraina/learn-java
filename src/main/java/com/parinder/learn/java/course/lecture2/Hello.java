package com.parinder.learn.java.course.lecture2;

/*
public and class are two java keywords.

public - java keyword is an access modifier. An access modifier allows us to define the scope or how other
part of your code or even some else's code can access the code.

class - The class keyword is used to define the class with the name following the keyword - Hello in this
case and right and left curly braces to define the class block.
 */
public class Hello {
    /*
    Defining the Main Method:

    public - is an access modifier

    static - is a java keyword that needs an understanding of other concepts, for now, know that we need to
    have static for java to find out method to run the code we are going to add.

    void - is another java keyword used to indicate that the method will not return anything -more on that later.
     */

    public static void main(String[] args) {
        /*
        Statement - This is complete command to be executed and can include one or more expressions.
         */
        System.out.println("Hello");
    }
}
