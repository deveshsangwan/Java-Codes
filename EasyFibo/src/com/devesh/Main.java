package com.devesh;
import java.lang.Math;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// write your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a-- > 0){
		int n = sc.nextInt();
		if(n == 1){

        }
		else {
            n = (anInt(n) - 1);
            int ans = fibo(n) % 10;
            System.out.println(ans);
        }
	}
	}

	public static int fibo(int n){
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
	}

	public static int anInt(int n){
		int b = 1;
		while(Math.pow(2, b) <= n){
			b++;
		}
		return (int)(Math.pow(2, b - 1));
	}
}
