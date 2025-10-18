package calculator.common;

import calculator.domain.Separator;

import java.util.StringTokenizer;

public class CalculatorService {

    public int calculate(String input) {
        Separator separator = new Separator();

        input = separator.parseSeparator(input);
        StringTokenizer token = new StringTokenizer(input, separator.getSeparator());

        return sum(token);
    }

    private int sum(StringTokenizer token) {
        int sum = 0;

        while (token.hasMoreTokens()) {
            String t = token.nextToken();

            // 양수 검증
            if(!t.matches("\\d+"))
                throw new IllegalArgumentException("잘못된 입력값");

            sum += Integer.parseInt(t);
        }

        return sum;
    }
}