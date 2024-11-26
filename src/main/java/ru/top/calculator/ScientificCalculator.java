package ru.top.calculator;


import ru.top.calculator.Calculator;

public class ScientificCalculator {

        public Calculator calculator;

        public ScientificCalculator(Calculator calculator) {
            this.calculator = calculator;
        }

        public int sum(int arg1, int arg2) {


            return calculator.sum(arg1, arg2);
        }





    }
