package com.example.monster;

public abstract class Monster {
    public String getName() {
        return name;
    }
    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    public abstract String attack();
}
