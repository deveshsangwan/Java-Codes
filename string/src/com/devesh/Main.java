package com.devesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "This is a string";
        s = s + ", and this is more.";
        System.out.println(s);

        String s1 = "10";
        int i = 50;
        s1 = s1 + i;         //when we add a int or double to a String then  that int/double is treated as a String only
        System.out.println(s1);
    }
}
/* Strings are immutable in java.*/