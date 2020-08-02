package com.devesh;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("CP LAB INVENTORY MANAGEMENT SYSTEM");
		System.out.println("MENU: \n1. Add item \n2. Update records \n3. Delete item \n4. Display Records \n5. Exit");

		int c = 0;
		String filename = "INV.txt";
		while(c != 5){
            c = sc.nextInt();
		switch (c){
			case 1:
				int sno;
				String name;
				int Quantity;
				System.out.println("Enter Item ID");
				sno = sc.nextInt();
				System.out.println("Enter Item");
				name = sc.next();
				System.out.println("Enter Quantity");
				Quantity = sc.nextInt();
				Inventory inv = new Inventory(sno, name, Quantity);
				try {
					FileOutputStream f = new FileOutputStream(filename);
					ObjectOutputStream o = new ObjectOutputStream(f);
					o.writeObject(inv);

					o.close();
					f.close();
				}
				catch (IOException ex) {
					System.out.println("Something went wrong");
				}
				break;
			case 2:
				System.out.println("Enter item ID to be updated");
				int sid = sc.nextInt();
				try {
					FileInputStream fis = new FileInputStream(filename);
					ObjectInputStream o1 = new ObjectInputStream(fis);
					Inventory d = (Inventory) o1.readObject();
					while(d != null){
						if(d.sno == sid){

						}
					}
				}
				catch (IOException ex){
					System.out.println("IOException");
				}
				catch (ClassNotFoundException ex){
					System.out.println("ClassNotFoundException");
				}
				break;
			case 3:
				break;
			case 4:
                try {
                    FileInputStream fis = new FileInputStream(filename);
                    ObjectInputStream o1 = new ObjectInputStream(fis);
                    Inventory d = (Inventory) o1.readObject();
                    while(d != null){
                        System.out.println("Item ID " + d.sno);
                        System.out.println("Item Name " + d.name);
                        System.out.println("Quantity " + d.Quantity);
                        break;
                    }
                }
                catch (IOException ex){
                    System.out.println("IOException");
                }
                catch (ClassNotFoundException ex){
                    System.out.println("ClassNotFoundException");
                }
				break;
		}
		}
	}
}
