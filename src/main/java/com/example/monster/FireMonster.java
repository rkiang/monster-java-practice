package com.example.monster;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }
    public String attack(){
        return getName()+ " Attack with fire";
    }
}
