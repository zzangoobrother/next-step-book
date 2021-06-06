package com.example.nextstepbook.step1.practice.service;

import com.example.nextstepbook.step1.practice.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int calculatorResult(String inputStr) {
        Calculator calculator = new Calculator(inputStr);

        if (calculator.emptyInput()) {
            return 0;
        }

        String separator = calculator.separatorTo();
        String[] divisions = calculator.division(separator);
        int sum = calculator.allSum(divisions);

        return sum;
    }

}
