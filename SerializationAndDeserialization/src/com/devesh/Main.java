package com.devesh;
import java.io.*;
class demo implements Serializable{
    int a = 10;
    transient int b = 20;
    static int c = 30;
    transient static int d = 40;
    transient final int e = 50;
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        demo d1 = new demo();
        String filename = "output.txt";
        try {
            FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(d1);

            o.close();
            f.close();
        }
        catch (IOException ex){
            System.out.println("IOException");
        }
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream o1 = new ObjectInputStream(fis);
            demo d2 = (demo) o1.readObject();
            System.out.println(d2.a);
            System.out.println(d2.b);
            System.out.println(d2.c);
            System.out.println(d2.d);
            System.out.println(d2.e);
        }
        catch (IOException ex){
            System.out.println("IOException");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
        }
    }
}
