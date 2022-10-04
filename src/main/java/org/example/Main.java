package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.InventoryBuilder;
import org.example.knight.inventory.weapon.Sword;

public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop();
       System.out.println("print\n");
       shop.printProducts();
       Inventory inventory = shop.getProduct(0);
       System.out.println("get inventory"+inventory.toString());
       shop.printProducts();
    }

}
