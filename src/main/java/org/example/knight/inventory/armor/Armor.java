package org.example.knight.inventory.armor;

import org.example.knight.inventory.Inventory;

public class Armor extends Inventory {

    int armor;

    public Armor(int armor ,float price) {
        super(price);
        this.armor = armor;
    }

    @Override
    public String toString() {
        return super.toString()+" "+armor;
    }
}
