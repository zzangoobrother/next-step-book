package com.example.nextstepbook.step1;

import com.example.nextstepbook.step1.practice.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator customSeparatorCalculator; // 커스텀 구분자 존재
    Calculator noCustomSeparatorCalculator; // 커스텀 구분자 미존재

    @BeforeEach
    void init() {
        customSeparatorCalculator = new Calculator("//;/\n1;2;3");
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

    @Test
    void 구분자_존재() {
        String[] divisions = customSeparatorCalculator.division(";");

        assertThat(divisions).contains("1", "2", "3");
    }

    @Test
    void 구분자_미존재() {
        String[] divisions = noCustomSeparatorCalculator.division(" ");

        assertThat(divisions).contains("1", "2", "3");
    }

    @Test
    void 음수_예외처리() throws Exception {
        Calculator calculator = new Calculator("-1,2:3");
        assertThrows(RuntimeException.class, () -> {
            calculator.separatorTo();
        });
    }

    @Test
    void 커스텀구분자_합구하기() {
        String separator = customSeparatorCalculator.separatorTo();
        String[] divisions = customSeparatorCalculator.division(separator);
        int sum = customSeparatorCalculator.allSum(divisions);

        assertThat(sum).isEqualTo(6);
    }

    @Test
    void 기본커스텀_합구하기() {
        String separator = noCustomSeparatorCalculator.separatorTo();
        String[] divisions = noCustomSeparatorCalculator.division(separator);
        int sum = noCustomSeparatorCalculator.allSum(divisions);

        assertThat(sum).isEqualTo(6);
    }

}