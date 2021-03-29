package com.it;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest2 {

    @BeforeAll

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSetLiquidWithNull2() {
        Cup cup = new Cup("juice", 70.0);
        cup.setLiquidType(null);
        assertNotNull(cup.getLiquidType());
    }

    @Test
    void getLiquidType() {
    }

    @Test
    void setLiquidType() {
    }

    @Test
    void getPercentFull() {
    }
}