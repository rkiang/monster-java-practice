package com.example.monster;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }
    public String attack(){
        return getName()+" Attack with stones";
    }
}
