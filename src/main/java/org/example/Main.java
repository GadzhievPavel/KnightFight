package org.example;

import org.example.knight.Knight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Knight knight = new Knight();
        int[] arr = new int[]{1,23,56};
        try{
            Integer i1 = null;
            i1++;
            for (int i =0; i<5;i++){
                System.out.println(arr[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вышли за предел" + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("object not init");
        }finally {
            System.out.println("bye");
        }

    }
}