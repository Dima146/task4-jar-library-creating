package by.epam.expression_parser.library;

import java.util.Stack;

public final class EvaluationOperator {

    private EvaluationOperator() {
    }

    public static Double evaluateOperator(Stack<String> operators,
                                          Stack<Double> values) {

        double value = values.pop();
        if (!operators.empty()) {
            String operator = operators.pop();
            switch (operator) {
                case "+":
                    value = values.pop() + value;
                    break;
                case "-":
                    value = values.pop() - value;
                    break;
                case "*":
                    value = values.pop() * value;
                    break;
                case "/":
                    value = values.pop() / value;
                    break;
                default:
                    break;
            }
        }
        return value;
    }
}
