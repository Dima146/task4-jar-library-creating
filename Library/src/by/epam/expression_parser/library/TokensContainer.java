package by.epam.expression_parser.library;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public final class TokensContainer {

    private TokensContainer() {
    }

    public static Queue<String> placeTokens(String expression) {
        expression = expression.replaceAll("\\s+","");
        String[] strings = expression.split("");
        Queue<String> tokens = new LinkedList<>();
        tokens.addAll(Arrays.asList(strings));
        return tokens;
    }
}
