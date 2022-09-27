package org.example;

import org.example.knight.inventory.Inventory;

public class Shop {
    Inventory[] inventories;

    public Shop(){

    }

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
