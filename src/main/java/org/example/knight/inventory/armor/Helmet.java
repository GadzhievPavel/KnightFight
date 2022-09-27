package org.example.knight.inventory.armor;

public class Helmet extends Armor implements IArmor{

    public Helmet(int armor, float price) {
        super(armor, price);
    }

    @Override
    public int defend(int damage) {
        return 0;
    }

    @Override
    public String toString() {
        return "Шлем "+super.toString();
    }
}
