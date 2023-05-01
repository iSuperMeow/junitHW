package org.example;

public class Calc {
    public int sum(int a, int b) {
        return a + b;
    }


    public int div(int a, int b) {
        if (b != 0)
            return a / b;
        else
            throw new ArithmeticException("Попытка деления на ноль");
    }
}