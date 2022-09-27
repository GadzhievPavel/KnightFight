package org.example.knight.inventory.weapon;

import org.example.knight.inventory.Inventory;

public class Axe extends Weapon implements IWeapon {

    public Axe(int damage, float price) {
        super(damage, price);
    }

    @Override
    public int damage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Топор "+super.toString();
    }
}
