package race;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Race {
    private static String userInputText;
    private static Stream<String> splitText;

    public void userInterfaceInput() {
        System.out.printf("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        Scanner scanner = new Scanner(System.in);
        userInputText = scanner.nextLine();
        removeWhitespace();
        splitText();
    }

    private static String removeWhitespace() {
        return userInputText.trim();
    }

    private static void splitText() {
        if (!userInputText.isEmpty()) {
            splitText = Pattern.compile(",").splitAsStream(userInputText);
        }
    }
}
