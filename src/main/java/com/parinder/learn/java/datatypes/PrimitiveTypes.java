package com.parinder.learn.java.datatypes;

/*
Java defines eight primitive types of data: byte, short, int, long, char, float, double, and boolean.
The primitive types represent single values—not complex objects.
Although Java is otherwise completely object-oriented, the primitive types are not.
*/
public class PrimitiveTypes {

    /*
    Java defines four integer types: byte, short, int, and long.
    All of these are signed, positive and negative values.
    Java does not support unsigned, positive-only integers.
     */
    public void dataTypes(int integerDataType,
                          byte byteDataType,
                          short shortDataType,
                          long longDataType,
                          double doubleDataType,
                          float floatDataType,
                          char characterDataType1,
                          char characterDataType2,
                          Boolean booleanDataType1,
                          Boolean booleanDataType2) {
        System.out.println("Integer Value Is : " + integerDataType);
        System.out.println("Byte Value Is : " + byteDataType);
        System.out.println("Short Value Is : " + shortDataType);
        System.out.println("Long Value Is : " + longDataType);
        System.out.println("Double Value Is : " + doubleDataType);
        System.out.println("Float Value Is : " + floatDataType);
        System.out.println("Character Value Is : " + characterDataType1);
        System.out.println("Character Value Is : " + characterDataType2);
        System.out.println("Boolean Value Is : " + booleanDataType1);
        System.out.println("Boolean Value Is : " + booleanDataType2);
    }

    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        int integerValue = 2398 * 234;
        byte byteValue = 10 * 10;
        short shortValue = 10 * 15;
        long longValue = 2345 * 5678;
        double doubleValue = 12.78 * 3.1119;
        float floatValue = 2.23f;

        /* Notice that ch1 is assigned the value 88,
        which is the ASCII (and Unicode) value that corresponds to the letter X.
         */
        char charValue1 = 88;
        char charValue2 = 'Y';

        /*
        charValue2 Increment, In this, charValue2 is first given the value Y. Next, charValue2 is incremented.
        This results in charValue2 containing Z, the next character in the ASCII (and Unicode) sequence.
         */
        charValue2++;

        /*
        Java has a primitive type, called boolean, for logical values.
        It can have only one of two possible values, true or false.
         */

        primitiveTypes.dataTypes(integerValue,
                byteValue,
                shortValue,
                longValue,
                doubleValue,
                floatValue,
                charValue1,
                charValue2,
                true,
                false);
    }
}
