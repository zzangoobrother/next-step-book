package com.example.nextstepbook.step1;

import com.example.nextstepbook.step1.practice.CalculatorOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorOperationsTest {

    private CalculatorOperations calculatorOperations;

    @BeforeEach
    void init() {
        calculatorOperations = new CalculatorOperations();
    }

    @Test
    void 더하기() {
        assertEquals(9, calculatorOperations.add(6, 3));
    }

    @Test
    void 빼기() {
        assertEquals(calculatorOperations.subtract(6, 3), 3);
    }

    @Test
    void 곱하기() {
        assertEquals(calculatorOperations.multiply(6, 3), 18);
    }

    @Test
    void 나누기() {
        assertEquals(calculatorOperations.divide(6, 3), 2);
    }

}