package com.example.monster;

public class WaterMonster extends  Monster{
    public WaterMonster(String name) {
        super(name);
    }

    public String attack() {
        return getName()+" Attack with water";
    }
}
