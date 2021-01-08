package com.company;

public class Hero {
    private int health;
    private double damage;
    private String superAbility;

    public Hero(int health, double damage) {
        this.health = health;
        this.damage = damage;
    }
    public Hero(String superAbility, int health, double damage) {
        this.superAbility = superAbility;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
