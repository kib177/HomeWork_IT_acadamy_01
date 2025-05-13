package org.example;

/**
 * Класс калькулятора с функциями
 * @author Kirill Brigi
 */
public class Calcul {

    /**
     * Функция выполняющая сложение
     * @param a - целочисленное значение типа int
     * @param b - целочисленное значение тип int
     * @return сумму a, b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Функция выполняющая вычетание
     * @param a - целочисленное значение типа int
     * @param b - целочисленное значение тип int
     * @return - разность a, b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Функция выполняющая умножение
     * @param a - целочисленное значение типа int
     * @param b - целочисленное значение тип int
     * @return умножение a, b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Функция выполняющая деление
     * @param a - целочисленное значение типа int
     * @param b - целочисленное значение тип int
     * @return деленение a, b
     */
    public int divide(int a, int b) throws Exception {
        if(b == 0) throw new Exception("Деление на ноль");
        return a / b;
    }

}
