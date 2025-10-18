package calculator.domain;

public class Separator {
    private String separator = ",:";

    public String parseSeparator(String line) {
        if (line.contains("//") && line.contains("\\n")) {
            /*
            문자열 앞 부분의 '//'와 '\n' 사이의 문자를 가져온다 했으므로 인덱스 2의 값을 가져옴
            인덱스로 특정하는 이유는 조건에 여러 문자(단어)였을 시 문자열 혹은 단어로 지칭했을 것이라 생각하기에
            인덱스 2로 지정하는 방법을 채택
            */
            separator = separator + line.charAt(2);

            return line.substring(5);
        } else
            return line;
    }

    public String getSeparator() {
        return separator;
    }
}
