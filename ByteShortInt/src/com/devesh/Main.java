package com.devesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("int");
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("min Value  " + minValue);
        System.out.println("max Value  " + maxValue);
        System.out.println();

        System.out.println("long");
        long minValue2 = Long.MIN_VALUE;
        long maxValue2 = Long.MAX_VALUE;
        System.out.println("min Value  " + minValue2);
        System.out.println("max Value  " + maxValue2);
        System.out.println();

        System.out.println("byte");
        byte minValue3 = Byte.MIN_VALUE;
        byte maxValue3 = Byte.MAX_VALUE;
        System.out.println("min Value  " + minValue3);
        System.out.println("max Value  " + maxValue3);
        System.out.println();

        System.out.println("short");
        short minValue4 = Short.MIN_VALUE;
        short maxValue4 = Short.MAX_VALUE;
        System.out.println("min Value  " + minValue4);
        System.out.println("max Value  " + maxValue4);
        System.out.println();

        int IntMin_Value = -2_147_483_648;   //Write long numbers using underscore for better readability
        System.out.println(IntMin_Value);

        byte a = 10;
        byte b = (byte) (a/2);
        /*we can"t write
        * byte b = (a/2)
        * because when we apply any operation then the data type gets converted into int thus we have to type cast
        * but you dont need to type cast in case of long
        * long accepts int values*/

    }
}
