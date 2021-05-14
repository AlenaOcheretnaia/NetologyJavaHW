package hwjavacore.calculator;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //ошибка возникает в результате возникновения ситуации деления на 0

    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : x;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
