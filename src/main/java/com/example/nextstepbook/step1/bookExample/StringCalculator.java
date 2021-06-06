package com.example.nextstepbook.step1.bookExample;

public class StringCalculator {

    public int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        if (text.contains(",")) {
            String[] values = text.split(",");
            int sum = 0;
            for (String value : values) {
                sum += Integer.parseInt(value);
            }
            return sum;
        }

        return Integer.parseInt(text);
    }
}
