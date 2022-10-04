package org.example.knight.inventory.weapon;

import org.example.knight.inventory.ICalcDamage;
import org.example.knight.inventory.ICalcPrice;
import org.example.knight.inventory.Inventory;

import java.util.Random;

public class Weapon extends Inventory implements ICalcDamage, ICalcPrice {
    int damage;

    public Weapon(int damage, float price) {
        super(price);
    }

    @Override
    public String toString() {
        return super.toString()+" "+damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public void calcDamage() {
        Random random = new Random();
        this.damage = random.nextInt(40)+5;
    }

    @Override
    public void calcPrice() {
        Random random = new Random();
        setPrice(random.nextInt(20)+10);
    }
}
