package org.example;

import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.InventoryBuilder;
import org.example.knight.inventory.armor.Armor;
import org.example.knight.inventory.armor.Helmet;
import org.example.knight.inventory.armor.Kerasa;
import org.example.knight.inventory.armor.Shild;
import org.example.knight.inventory.weapon.Axe;
import org.example.knight.inventory.weapon.Spear;
import org.example.knight.inventory.weapon.Sword;
import org.example.knight.inventory.weapon.Weapon;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Shop {
    Inventory[] inventories;


    ArrayList<Inventory> inventoriesShop;
    public Shop(){
        inventoriesShop = new ArrayList<>();
        inventoriesShop.add(new Helmet());
        inventoriesShop.add(new Kerasa());
        inventoriesShop.add(new Shild());
        inventoriesShop.add(new Axe());
        inventoriesShop.add(new Spear());
        inventoriesShop.add(new Sword());

        inventories = generateRandomInventory();


    }

    private Inventory[] generateRandomInventory(){
        Inventory[] inventories1 = new Inventory[6];
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            Inventory inventory = inventoriesShop.get(random.nextInt(5));
            InventoryBuilder builder = new InventoryBuilder(inventory);
            inventories1[i] = builder.build();
        }
        return inventories1;
    }

//    private Inventory getCompleteInventory(Inventory inventory){
//        if(inventory instanceof Armor){
//            Armor armor = (Armor)inventory;
//            armor.calcArmor();
//            armor.calcPrice();
//            System.out.println(armor.toString());
//        }else if(inventory instanceof Sword){
//            Sword sword = (Sword)inventory;
//            sword.calcPrice();
//            sword.calcDamage();
//            sword.setName("XXX");
//            System.out.println(sword.toString());
//        }else if (inventory instanceof Weapon) {
//            Weapon weapon = (Weapon) inventory;
//            weapon.calcPrice();
//            weapon.calcDamage();
//            System.out.println(weapon.toString());
//        }
//        return inventory;
//    }
    public Inventory getProduct(int i){
        if(inventories[i]!=null){
            return inventories[i];
        }
        throw new RuntimeException("Нет такого товара");
    }

    public void printProducts(){
        for (Inventory inventory:inventories) {
            System.out.println(inventory.toString());
        }
    }
}
