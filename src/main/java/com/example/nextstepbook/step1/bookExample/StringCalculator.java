package com.example.nextstepbook.step1.bookExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInts(split(text)));
    }

    private boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    private String[] split(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimeter = matcher.group(1);
            return matcher.group(2).split(customDelimeter);
        }

        return text.split(",|:");
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i =0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }
}
