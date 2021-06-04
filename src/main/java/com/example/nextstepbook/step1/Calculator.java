package com.example.nextstepbook.step1;

/*
    쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달, 구분자를 기준으로 분리하여 숫자의 합을 구한다.
    ex) " " => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6)

    앞의 구분자 외에 커스텀 구분자 지정 가능, 커스텀 구분자는 "//"와 "\n"사이에 위치
    ex) "//;\n1;2;3" => 6

    문자열 계산기에 음수 전달시 RuntimeException 예외 처리
 */

public class Calculator {

    String inputStr;

    public Calculator(String inputStr) {
        this.inputStr = inputStr;
    }

    /**
    * @param :
    * @return : 커스텀 구분자, 없으면 빈값
    **/
    public String separatorTo() {
        if (inputStr.startsWith("/")) {
            return inputStr.substring(2, 3);
        }

        return "";
    }

    public String[] division(String separator) {
        if (separator.isBlank()) {
            return separatorTo().split(",|:");
        }
        return inputStr.split(separator);
    }

    public int allSum(String[] inputStrings) {
        int sum = 0;

        for (String inputString : inputStrings) {
            sum += Integer.parseInt(inputString);
        }
        return sum;
    }

    public void validation(String inputStr) {
        String [] inputStrs = inputStr.split("-");
        if (inputStrs.length == 2) {
            throw new RuntimeException("음수가 있습니다.");
        }
    }

}
