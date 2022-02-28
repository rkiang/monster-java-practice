package com.example.monster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneMonsterTest {
    @Test
    void attack_should_return_valid_data() {
        StoneMonster stoneMonster = new StoneMonster("test");
        String attackMessage = stoneMonster.attack();
        org.assertj.core.api.Assertions.assertThat(attackMessage).isEqualTo("test Attack with stones");
    }
}