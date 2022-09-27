package org.example.knight.inventory.weapon;

import org.example.knight.inventory.Inventory;

public class Weapon extends Inventory {
    int damage;

    public Weapon(int damage, float price) {
        super(price);
    }

    @Override
    public String toString() {
        return super.toString()+" "+damage;
    }
}
