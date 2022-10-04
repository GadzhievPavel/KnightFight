package org.example.knight;

import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.armor.Armor;
import org.example.knight.inventory.armor.IArmor;
import org.example.knight.inventory.weapon.IWeapon;
import org.example.knight.inventory.weapon.Weapon;

import java.util.ArrayList;

public class Knight implements IArmor, IWeapon {
    String name;
    int health;
    float money;
    final int sizeBag = 6;
    ArrayList<Inventory> inventories;
    //Inventory[] inventories;
    int count;

    public Knight(String name, int health, float money){
        this.health = health;
        this.money = money;
        this.name = name;

        inventories = new ArrayList<>();
        count = 0;
    }

    public boolean canBuy(Inventory inventory){
        return money >= inventory.getPrice();
    }
    public boolean buy(Inventory inventory) throws RuntimeException{
        if(canBuy(inventory)){
            if (inventories.size()<sizeBag){
                inventories.add(inventory);
                money-=inventory.getPrice();
                System.out.println("Knight "+this.name+" купил "+inventory.getClass().getName());
                return true;
            }else{
                throw new RuntimeException("Рюкзак переполнен");
            }
        }else{
            throw new RuntimeException("Кончились деньги");
        }
    }
//    public void buy(Inventory inventory){
//        if(count<inventories.length){
//            if(money>= inventory.getPrice()){
//                inventories[count++] = inventory;
//                this.money-=inventory.getPrice();
//            }else{
//                throw new MyException();
//            }
//        }else{
//            throw new BagException();
//        }
//    }
    @Override
    public int defend(int damage) {

        return 0;
    }

    @Override
    public int getDefend() {
        return allArmor();
    }

    @Override
    public int damage() {
        return 0;
    }

    public int allDamage(){
        int damages =0;
        ArrayList<IWeapon> iWeapons = new ArrayList<>();
        for (Inventory inventory: inventories) {
            if(inventory instanceof Weapon){
                iWeapons.add((Weapon)inventory);
            }
        }
        for (IWeapon weapon : iWeapons){
            damages+=weapon.damage();
        }
        return damages;
    }

    public int allArmor(){
        int armors = 0;
        ArrayList<IArmor> iArmors = new ArrayList<>();
        for (Inventory inventory:inventories) {
            if (inventory instanceof Armor){
                iArmors.add((IArmor) inventories);
            }
        }
        for (IArmor armor: iArmors) {
            armors+=armor.getDefend();
        }
        return armors;
    }
}
