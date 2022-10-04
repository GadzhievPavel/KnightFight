package org.example.knight.inventory.weapon;

public class Sword extends Weapon implements IWeapon{


    String name;

    public Sword(){
        super(0,0);
    }

    public Sword(String name, int damage, float price) {
        super(damage, price);
        this.name = name;
    }

    public Sword(Sword sword){
        super(sword.damage(), sword.getPrice());
        this.name = sword.name;
    }

    @Override
    public int damage() {
        return damage;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Меч"+super.toString();
    }
}
