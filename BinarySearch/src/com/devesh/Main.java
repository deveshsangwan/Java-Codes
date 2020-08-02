package com.devesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] Arr = new int[size];
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Kya search karu BC?");
        int n = sc.nextInt();
        int index = BinarySearch(Arr, 0, Arr.length - 1, n);
        System.out.println(index);
    }

    public static int BinarySearch(int[] Arr, int si, int ei, int n){
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei)/2;

        if (n == Arr[mid]){
            return mid;
        }

        else if (n > mid){
            return BinarySearch(Arr, mid + 1, ei, n);
        }

        else{
            return BinarySearch(Arr, si, mid - 1, n);
        }
    }
}
