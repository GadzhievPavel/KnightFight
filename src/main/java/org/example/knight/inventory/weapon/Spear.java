package org.example.knight.inventory.weapon;

public class Spear extends Weapon implements IWeapon{

    public Spear(int damage, float price) {
        super(damage, price);
    }

    @Override
    public int damage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Копье "+super.toString();
    }
}
