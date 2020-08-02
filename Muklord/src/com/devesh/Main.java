package com.devesh;
import esg.itp.shape.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Square s1 = new Square(5);
        Rectangle r1 = new Rectangle(4,5);

        s1.calArea();
        s1.calPeri();
        s1.Display();
        r1.calArea();
        r1.calPeri();
        r1.Display();
    }
}
