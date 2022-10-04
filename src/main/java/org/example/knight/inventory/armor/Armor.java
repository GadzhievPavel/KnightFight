package org.example.knight.inventory.armor;

import org.example.knight.inventory.ICalcArmor;
import org.example.knight.inventory.ICalcPrice;
import org.example.knight.inventory.Inventory;

import java.util.Random;

public class Armor extends Inventory implements ICalcArmor, ICalcPrice {

    int armor;

    public Armor(int armor ,float price) {
        super(price);
        this.armor = armor;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    @Override
    public String toString() {
        return super.toString()+" "+armor;
    }

    @Override
    public void calcArmor() {
        Random random = new Random();
        this.armor = random.nextInt(70)+10;
    }

    @Override
    public void calcPrice() {
        Random random = new Random();
        setPrice(random.nextInt(30)+15);
    }
}
