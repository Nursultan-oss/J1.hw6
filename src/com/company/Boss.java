package com.company;

public class Boss extends GameEntity {

    Weapon boss;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        boss = weapon;
    }

    public Weapon getBoss() {
        return boss;
    }

    public void setBoss(Weapon boss) {
        this.boss = boss;
    }
    public  String printInfo(){
        return "\nWeapon = " +  getBoss().getNameWeapon() + "\nType = " +  getBoss().getTypeWeapon() +
                "\nhealth = " + getHealth() + "\nDamage = " + getDamage();
    }
}

