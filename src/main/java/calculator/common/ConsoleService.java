package calculator.common;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleService {

    public static String input() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }

    public static void output(String output) {
        System.out.println("결과 : " + output);
    }

    public static void error(String error) {
        System.out.println(error);
    }
}
