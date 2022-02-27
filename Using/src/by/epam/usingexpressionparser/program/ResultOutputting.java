package by.epam.usingexpressionparser.program;

public final class ResultOutputting {

    private ResultOutputting() {
    }

    public static void outputResult(String str, double res) {
        str = str.replaceAll("\\s+", "");
        System.out.println("Результат выражения " + str +
                " = " + res);
    }
}
