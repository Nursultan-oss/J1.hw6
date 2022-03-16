package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss(750, 70,new Weapon("ColdWeapon","Knife"));
        System.out.println("Boss" + boss.printInfo());
        Skeleton skeleton1= new Skeleton(100,5,new Weapon("gunshot", "Gun"));
        System.out.println( "Skeleton 1" + skeleton1.printInfo());
        Skeleton skeleton2= new Skeleton(103,6,new Weapon("gunshot", "desert eagle"));
        System.out.println( "Skeleton 2" + skeleton2.printInfo());

    }
}
