package com.devesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char c = 'a';
        char c1 = '\u0905';
        System.out.println(c);
        System.out.println(c1);
        System.out.println((int)c);
        System.out.println((int)c1);

        //challenge
        char c2 = '\u00AE';
        System.out.println(c2);
        System.out.println((int)c2);

    }
}
