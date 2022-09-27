package org.example.knight.inventory;

public abstract class Inventory {
    float price;

    public Inventory(float price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }
}
