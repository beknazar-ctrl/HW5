package com.company;

public class Boss {
    private int health;
    private int damage;
    private String bossDefenceType;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

}
