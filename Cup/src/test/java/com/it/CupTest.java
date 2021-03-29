package com.it;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    Cup cup;

    @BeforeEach
    public void setUp() { Cup cup = new Cup ("water", 75.0);
    }


    @Disabled("Failing due to bug 2545")
    @Test
    void testObjectCreation() {
        assertEquals("water", cup.getLiquidType());
        assertEquals(75, cup.getPercentFull(), 0.0001);
    }

    @Test
    void testObjectCreationAssertAll() {

        assertAll("Correctly builds object",
                () -> assertEquals("water", cup.getLiquidType()),
                () -> assertEquals(75, cup.getPercentFull(), 0.0001)
        );
    }

    @Test
    void testIsEmpty() {
        Cup cup = new Cup("water", 70.0);
        assertFalse(cup.isEmpty());
    }

    @Test
    void testSetLiquidWithNull() {
        Cup cup = new Cup("juice", 60.0);
        cup.setLiquidType(null);
        assertNotNull(cup.getLiquidType());
    }

    @Test
    void testPercentThrows() {
        Cup cup = new Cup ("water", 80.0);
        assertThrows(IllegalArgumentException.class,
                () -> cup.setPercentFull(-1)
                );
    }
}