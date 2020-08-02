package com.devesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float f = 4.2f;
        float f1 = (float) 4.2;
        /* we cant write float f = 4.2, because when we input a decimal value it is interpreted as double */
        double d = 4.2;


        float f2 = 5f/3f;
        double d1 = 5d/3d;                         //double takes more space but it is faster
        // in most modern computers and usually all calculations in java are done in form of double
        System.out.println(f2);
        System.out.println(d1);
        //double is more precise then float
        // only downside of double is that is takes 8 bytes of space whereas float occupies only 4 bytes

        double pi = 3.141_592_7;
        System.out.println(pi);


        //challenge
        double pounds, kilograms;
        Scanner S = new Scanner(System.in);
        System.out.print("enter weight in pounds ");
        pounds = S.nextDouble();
        kilograms = (pounds*0.45359237);
        System.out.println("weight in kilograms" + kilograms);

    }
}
