package com.company;

public class Skeleton extends Boss{
    public Skeleton(int health, int damage, Weapon weapon) {
        super(health, damage, weapon);
    }

    public int getNumArrow() {
        return numArrow;
    }

    public void setNumArrow(int numArrow) {
        this.numArrow = numArrow;
    }

    private int numArrow;

    @Override
    public String printInfo() {
        return super.printInfo();
    }
}
