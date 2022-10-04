package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.weapon.Sword;

public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop();
       System.out.println("print\n");
       shop.printProducts();
    }

}
