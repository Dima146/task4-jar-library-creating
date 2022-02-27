package by.epam.usingexpressionparser.program;

import java.util.Scanner;

public class StringReceiver {
    private final Scanner scanner = new Scanner(System.in);
    private String expression;

    public String receiveString(String str) {
        System.out.println(str);
        return this.expression = scanner.nextLine();
    }
}
