package com.parinder.learn.java.inheritence;

// A simple example of inheritance.

// CREATE A SUPERCLASS
class SuperClass {
    int firstIntTypeSuperClassVariable, secondIntTypeSuperClassVariable;

    public void showSuperClassVariables() {
        System.out.println("First and Second Variable: "
                + firstIntTypeSuperClassVariable + " " + secondIntTypeSuperClassVariable);
    }
}

// CREATE SUBCLASS BY EXTENDING CLASS BASICS
class SubClass extends SuperClass {
    int subClassIntTypeVariable;

    public void showSubClassVariable() {
        System.out.println("SubClass Variable : " + subClassIntTypeVariable);
    }

    void sumAllVariables() {
        System.out.println("Sum of all variables (Super & Sub class's variables): "
                + (firstIntTypeSuperClassVariable
                + secondIntTypeSuperClassVariable
                + subClassIntTypeVariable));
    }
}

public class Basics {
    public static void main(String args[]) {
        // CREATE OBJECTS FOR CLASS (Super & Sub)
        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();

        // The superclass may be used by itself.
        superClass.firstIntTypeSuperClassVariable = 10;
        superClass.secondIntTypeSuperClassVariable = 20;

        System.out.println("Contents of Super Class: ");
        superClass.showSuperClassVariables();

        // The subclass has access to all public members of its superclass

        subClass.firstIntTypeSuperClassVariable = 7;
        subClass.secondIntTypeSuperClassVariable = 8;
        subClass.subClassIntTypeVariable = 9;

        System.out.println("Contents of Sub Class: ");

        subClass.showSuperClassVariables();
        subClass.showSubClassVariable();

        System.out.println("Sum of All Variables in SubClass:");
        subClass.sumAllVariables();
    }
}
/*
As you can see, the subclass  includes all of the members of its superclass.
This is why subClass (object) can access firstIntTypeSuperClassVariable and secondIntTypeSuperClassVariable
and call showSuperClassVariables( ).

Also, inside sumAllVariables( ), firstIntTypeSuperClassVariable and secondIntTypeSuperClassVariable
can be referred to directly, as if they were part of subClass.

Even though superClass is a superclass for subClass, it is also a completely independent, stand-alone class.
Being a superclass for a subclass does not mean that the superclass cannot be used by itself.
Further, a subclass can be a superclass for another subclass.

The general form of a class declaration that inherits a superclass is shown here:
                class subclass-name extends superclass-name {
                // body of class
                }
You can only specify one superclass for any subclass that you create.
Java does not support the inheritance of multiple superclasses into a single subclass.

You can, as stated, create a hierarchy of inheritance in which a subclass becomes a superclass of another subclass.
However, no class can be a superclass of itself.

 */
