package com.example.nextstepbook.step1.bookExample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void add_null_또는_빈문자() {
        assertEquals(0, stringCalculator.add(null));
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void add_숫자하나() throws Exception {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void add_쉼표구분자() throws Exception {
        assertEquals(3, stringCalculator.add("1,2"));
    }

}