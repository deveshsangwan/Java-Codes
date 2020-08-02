package com.devesh;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        //System.out.println();
        int l = in.nextInt();
        System.out.println("Enter breadth");
        int b = in.nextInt();
        Rectangles r1 = new Rectangles(l,b);
        r1.getLen();
        r1.getBre();
        r1.Area();
        r1.Display();
        r1.mutator();
        r1.Area();
        r1.Display();
    }

}
