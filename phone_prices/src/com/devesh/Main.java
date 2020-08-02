package com.devesh;

import java.util.Scanner;

public class Main {

    public static int goodprice(int P[]){
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < P.length; i++){
            if(i <= 5) {
                if (P[i] < min) {
                    System.out.println("OhBC!!!");
                    min = P[i];
                    count++;
                    System.out.println(count);
                }
            }
            else if(i > 5) {
                System.out.println("ooooooo");
                for(int j = i - 5; j < i; j++){
                    if(P[i] > P[j]){
                        count++;
                        System.out.println("BC!!" + i);
                        System.out.println(count);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while(i-- > 0){
            int n = s.nextInt();
            int[] P = new int[n];
            for(int j = 0; j < n; j++){
                P[j] = s.nextInt();
            }
            int count = goodprice(P);
            System.out.println(count);
        }
    }
}
