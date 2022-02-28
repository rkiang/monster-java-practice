package com.example.monster;

public class MonsterHandler {
    public static void handleMonsters(Monster[] monsters){
        for (Monster monster : monsters){
            System.out.println(monster.attack());
        }
    }
}
