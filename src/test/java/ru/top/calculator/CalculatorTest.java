package ru.top.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.top.calculator.Calculator;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(1, 1);

        Assertions.assertEquals(2, sum);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double divide = calculator.divide(4, 2);
        double divide2 = calculator.divide(5, 2);

        Assertions.assertEquals(2, divide);
        Assertions.assertEquals(2.5, divide2);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(RuntimeException.class, () ->calculator.divide(7, 0), "На ноль делить нельзя!");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDiff() {
        Calculator calculator = new Calculator();

        Assertions.assertEquals(-1, calculator.diff(2, 3));
    }

}
