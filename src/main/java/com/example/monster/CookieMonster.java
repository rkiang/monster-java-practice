package com.example.monster;

public class CookieMonster extends Monster {
    public CookieMonster(String name){
        super(name);
    }
    @Override
    public String attack() {
         {return
                getName() + " attack with cookie";}
    }
}
