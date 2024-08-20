public class ArithmeticFunction {
    public static int arithmeticFunction(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
        }
        ;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(arithmeticFunction(2, 30, "add"));
    }

    public static int alternateSwitch(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
    }
}
