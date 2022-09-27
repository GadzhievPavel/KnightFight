package org.example.knight;

import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.armor.IArmor;
import org.example.knight.inventory.weapon.IWeapon;

public class Knight implements IArmor, IWeapon {
    String name;
    int health;
    float money;

    Inventory[] inventories;
    int count;

    public Knight(String name, int health, float money){
        this.health = health;
        this.money = money;
        this.name = name;

        inventories = new Inventory[6];
        count = 0;
    }

    public void buy(Inventory inventory){
        if(count<inventories.length){
            if(money>= inventory.getPrice()){
                inventories[count++] = inventory;
                this.money-=inventory.getPrice();
            }else{
                throw new MyException();
            }
        }else{
            throw new BagException();
        }
    }
    @Override
    public int defend(int damage) {

        return 0;
    }

    @Override
    public int damage() {
        return 0;
    }
}
