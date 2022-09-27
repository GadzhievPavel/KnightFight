package org.example.knight.inventory.armor;

public class Shild extends Armor implements IArmor{

    public Shild(int armor, float price) {
        super(armor, price);
    }

    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public String toString() {
        return "Щит "+super.toString();
    }
}
