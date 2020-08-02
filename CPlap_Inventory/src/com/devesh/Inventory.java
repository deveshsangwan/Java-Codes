package com.devesh;

public class Inventory {
    int sno;
    String name;
    int Quantity;

    public Inventory(){
        this.sno = 0;
        this.name = null;
        this.Quantity = 0;
    }

    public Inventory(int sno, String name, int quantity){
        this.sno = sno;
        this.name = name;
        this.Quantity = quantity;
    }
}
