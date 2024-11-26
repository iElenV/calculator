package ru.top.calculator;

public class Calculator {

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public double divide(int arg1, int arg2) {
        if (arg2 == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        }
        return (double) arg1 / arg2;
    }

    public int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public int diff(int arg1, int arg2) {
        return arg1 - arg2;
    }

}
