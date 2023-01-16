package br.com.erudio.utils;

public class MathOps {
    public Double sum(Double number1, Double number2) {
        return number1 + number2;
    }

    public Double subtract(Double number1, Double number2) {
        return number1 - number2;
    }

    public Double multiply(Double number1, Double number2) {
        return number1 * number2;
    }

    public Double divide(Double number1, Double number2) {
        return number1 / number2;
    }

    public Double average(Double number1, Double number2) {
        return sum(number1, number2) / 2;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
