package by.epam.expression_parser.library;

import java.util.Queue;
import java.util.Stack;

public final class ExpressionValueCalculation {

    private ExpressionValueCalculation() {
    }

    public static double resultCalculate(String expression) {
        Queue<String> tokens = TokensContainer.placeTokens(expression);
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!tokens.isEmpty()) {
            String token = tokens.poll();
            switch (token) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    ops.push(token);
                    break;
                case ")":
                    vals.push(EvaluationOperator.evaluateOperator(ops, vals));
                    break;
                default:
                    vals.push(Double.parseDouble(token));
                    break;

            }
        }
        return EvaluationOperator.evaluateOperator(ops, vals);
    }
}






