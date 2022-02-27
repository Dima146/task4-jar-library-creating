package by.epam.usingexpressionparser.program;

import by.epam.expression_parser.library.ExpressionValueCalculation;

public class MainProgram {

    public static void main(String[] args) {
        StringReceiver stringReceiver = new StringReceiver();
        String str = stringReceiver.receiveString("Введите математическое выражение ");
        double expressionResult = ExpressionValueCalculation.resultCalculate(str); // Парсер и вычисление выражения
        ResultOutputting.outputResult(str, expressionResult);
    }
}
