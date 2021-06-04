package com.example.nextstepbook.step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator customSeparatorCalculator; // 커스텀 구분자 존재
    Calculator noCustomSeparatorCalculator; // 커스텀 구분자 미존재

    @BeforeEach
    void init() {
        customSeparatorCalculator = new Calculator("//;\n1;2;3");
        noCustomSeparatorCalculator = new Calculator("1,2:3");
    }

    @Test
    void 존재_커스텀구분자_구하기() {
        String separator = customSeparatorCalculator.separatorTo();

        assertThat(separator).isEqualTo(";");
    }

    @Test
    void 미존재_커스텀구분자_구하기() {
        String separator = noCustomSeparatorCalculator.separatorTo();

        assertThat(separator).isEqualTo("");
    }

}