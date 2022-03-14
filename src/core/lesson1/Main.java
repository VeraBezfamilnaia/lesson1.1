package core.lesson1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);

        /*
         * Ошибка заключается в том, что в качестве параметра b передается 0. А как мы знаем, на ноль делить нельзя
         * (о чем и говорит ArithmeticException)
         */
        int c = calculator.devideFixed.apply(a, b);
        calculator.println.accept(c);
    }
}
