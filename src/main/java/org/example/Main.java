package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.Inventory;
import org.example.knight.inventory.InventoryBuilder;
import org.example.knight.inventory.weapon.Sword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop();
       Knight knight = new Knight("Artur",100,100);
       Scanner scanner = new Scanner(System.in);
       boolean needBuy = true;
       do {
           System.out.println("Shoping\nВыберите позицию товара для покупки\nДля выхода нажмите -1");
           shop.printProducts();
           int i = scanner.nextInt();
           if(i>=0){
               try{
                   Inventory inventory = shop.getProduct(i);
                   shop.verificationBuy(knight.buy(inventory),i);
               }catch (RuntimeException e){
                   System.out.println(e.getMessage());
               }

           }else {
               needBuy = false;
           }
       }while (needBuy);
    System.out.println("Весь урон "+knight.allDamage());
    System.out.println("Вся броня "+knight.allArmor());
    }

}
