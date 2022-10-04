package org.example.knight.inventory.weapon;

public class Spear extends Weapon implements IWeapon{

    public Spear(){
        super(0,0);
    }

    public Spear(Spear spear){
        super(spear.damage,spear.getPrice());
    }

    public Spear(int damage, float price) {
        super(damage, price);
    }

    @Override
    public int damage() {
        System.out.println("Урон копья "+ damage);
        return damage;
    }

    @Override
    public String toString() {
        return "Копье "+super.toString();
    }
}
