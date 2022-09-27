package org.example;

import org.example.knight.BagException;
import org.example.knight.Knight;
import org.example.knight.MyException;
import org.example.knight.inventory.weapon.Sword;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sword sword = new Sword("Ласточка",100,5);
        Knight knight = new Knight("I",50,100);
        try {
            while (true){
                knight.buy(sword);
            }
        }catch (MyException myException){
            System.out.println("Деньги кончились");
        }catch (BagException bagException){
            System.out.println("Место кончилось");
        }finally {
            System.out.println("Экипировка завершена");
        }
    }

}
