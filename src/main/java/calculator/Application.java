package calculator;

import calculator.common.CalculatorService;
import calculator.common.ConsoleService;

public class Application {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        String input = ConsoleService.input();

        try {
            int result = calculatorService.calculate(input);
            ConsoleService.output(Integer.toString(result));

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("예상치 못한 오류: " + e);
        }
    }
}