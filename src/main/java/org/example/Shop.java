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
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Shop {
    //Inventory[] inventories;
    ArrayList<Inventory> inv;

    ArrayList<Inventory> inventoriesShop;
    public Shop(){
        inventoriesShop = new ArrayList<>();
        inventoriesShop.add(new Helmet());
        inventoriesShop.add(new Kerasa());
        inventoriesShop.add(new Shild());
        inventoriesShop.add(new Axe());
        inventoriesShop.add(new Spear());
        inventoriesShop.add(new Sword());

        inv = new ArrayList<>(Arrays.asList(generateRandomInventory()));
        //inventories = generateRandomInventory();
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


//    public Inventory getProduct(int i){
//        if(inventories[i]!=null){
//            Inventory inventory = new InventoryBuilder(inventories[i]).build();
//            inventories[i]=null;
//            //todo
//            return inventory;
//        }
//        throw new RuntimeException("Нет такого товара");
//    }

    public Inventory getProduct(int i){
        if(inv.get(i)!=null){
            Armor armor = new Armor(0,0);
            Inventory inventory = new InventoryBuilder(inv.get(i)).clone();
            //inventories[i]=null;
            //todo
            return inventory;
        }
        throw new RuntimeException("Нет такого товара");
    }

    public void printProducts(){
        for (Inventory inventory:inv) {
            System.out.println(inventory.toString());
        }
    }
}
