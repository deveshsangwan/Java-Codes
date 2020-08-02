package com.devesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] input = takeInput();
        printArray(input);
        mergeSort(input);
        printArray(input);
    }

    public static void mergeSort(int[] input){
        if (input.length <= 1){
            return;
        }

        int mid = input.length / 2;
        int p1[] = new int[mid];
        int p2[] = new int[input.length - mid];

        for (int i = 0; i < mid; i++){
            p1[i] = input[i];
        }

        int k = 0;

        for (int i = mid; i < input.length; i++){
            p2[k] = input[i];
            k++;
        }

        mergeSort(p1);
        mergeSort(p2);
        merge(p1, p2, input);
    }

    public static void merge(int[] input1, int[] input2, int[] output){
        int i = 0, j = 0, k = 0;

        while(i < input1.length && j < input2.length){
            if(input1[i] < input2[j]){
                output[k] = input1[i];
                i++;
            }else{
                output[k] = input2[j];
                j++;
            }
            k++;
        }

        while(i < input1.length){
            output[k] = input1[i];
            k++;
            i++;
        }

        while(j < input2.length){
            output[k] = input2[j];
            k++;
            j++;
        }
    }

    public static void printArray(int[] input){
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }
}
