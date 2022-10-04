package org.example.knight.inventory;

import org.example.knight.inventory.armor.Helmet;
import org.example.knight.inventory.armor.Kerasa;
import org.example.knight.inventory.armor.Shild;
import org.example.knight.inventory.weapon.Axe;
import org.example.knight.inventory.weapon.Spear;
import org.example.knight.inventory.weapon.Sword;

public class InventoryBuilder {

    Inventory inventory;

    public InventoryBuilder(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory build() {
        Kerasa kerasa = null;
        if (inventory instanceof Helmet) {
            Helmet helmet = new Helmet((Helmet) inventory);
            helmet.calcPrice();
            helmet.calcArmor();
            return helmet;
        } else if (inventory instanceof Kerasa) {
            kerasa = new Kerasa((Kerasa) inventory);
            kerasa.calcArmor();
            kerasa.calcPrice();
            return kerasa;
        } else if (inventory instanceof Shild) {
            Shild shild = new Shild((Shild) inventory);
            shild.calcArmor();
            shild.calcPrice();
            return shild;
        } else if (inventory instanceof Axe) {
            Axe axe = new Axe((Axe) inventory);
            axe.calcPrice();
            axe.calcDamage();
            return axe;
        } else if (inventory instanceof Spear) {
            Spear spear = new Spear((Spear) inventory);
            spear.calcPrice();
            spear.calcDamage();
            return spear;
        } else if (inventory instanceof Sword) {
            Sword sword = new Sword((Sword) inventory);
            sword.setName("XXX");
            sword.calcPrice();
            sword.calcDamage();
            return sword;
        }
        throw new NullPointerException();
        //return null;
    }
}
