package com.example.nextstepbook.step1.practice.controller;

import com.example.nextstepbook.step1.practice.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/step1")
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculatorForm() {
        return "step1/calculator";
    }

    @PostMapping("/calculator")
    public String calculatorResult(@RequestParam String inputStr, Model model) {
        Calculator calculator = new Calculator(inputStr);
        String separator = calculator.separatorTo();
        String[] divisions = calculator.division(separator);
        int sum = calculator.allSum(divisions);

        model.addAttribute("sum", sum);
        return "step1/calculatorResult";
    }
}
