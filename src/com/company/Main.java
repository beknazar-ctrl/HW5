package com.company;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero(500,40.5);
        Hero h2 = new Hero("Invisible",500,40.5);

        Boss b1=new Boss();
        b1.setDamage(50);
        b1.setHealth(600);
        b1.setBossDefenceType("Physical");
        System.out.println(b1.getDamage() + " " + b1.getHealth() + " " + b1.getHealth());


    }
}
