package org.designPatterns.behavioral.interpreter;

public class InterpreterExample {
    public static void main(String[] args) {
        Expression number1 = new Number(15);
        Expression number2 = new Number(5);
        Expression number3 = new Number(10);

        Expression plusExpression = new Plus(number1, number2);
        Expression minusExpression = new Minus(plusExpression, number3);

        int res = minusExpression.interpret();
        System.out.println("15 + 5 - 10 = " + res);
    }
}
