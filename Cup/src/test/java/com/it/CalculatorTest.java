package com.it;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    public com.it.Calculator setUp() { Calculator calc = new Calculator();
        calc.setFirstValue(2.0);
        calc.setSecondValue(3.0);

        return calc;
    }



}