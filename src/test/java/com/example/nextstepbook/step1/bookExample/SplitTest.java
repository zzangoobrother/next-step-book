package com.example.nextstepbook.step1.bookExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitTest {

    @Test
    void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }
}
