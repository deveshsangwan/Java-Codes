package com.devesh;

import java.io.*;
public class Rectangles
{
    int length;
    int breadth;
    int area;
    Rectangles(int l, int b)
    {
        length = l;
        breadth = b;
        area = 0;
    }
    public int getLen()
    {
        return length;
    }
    public int getBre()
    {
        return breadth;
    }
    public void mutator()throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter new length");
        int l = Integer.parseInt(in.readLine());
        System.out.println("Enter new breadth");
        int b = Integer.parseInt(in.readLine());
        this.length = l;
        this.breadth = b;

    }
    public void Area()
    {
        int area = length*breadth;
        System.out.println("Area of Rectangle is : "+area);
    }
    public void Display()
    {
        System.out.println("Length of Rectangle is : "+length);
        System.out.println("Breadth of Rectangle is : "+breadth);
    }
}

