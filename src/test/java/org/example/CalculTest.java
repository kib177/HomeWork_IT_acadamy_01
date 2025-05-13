package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс для тестирования класса Калькулятора
 * @author Kirill Brigi
 */
public class CalculTest {
    Calcul calculator = new Calcul();

    @Test
    @Timeout(5)
    @DisplayName("тестирование метода суммирования")
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    @Timeout(5)
    @DisplayName("тестирование метода вычетания")
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    @Timeout(5)
    @DisplayName("тестирование метода умножения")
    public void testMultiply() {
        int result = calculator.multiply(6, 3);
        assertEquals(18, result);
    }

    @Test
    @Timeout(5)
    @DisplayName("тестирование метода деления")
    public void testDivide() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> calculator.divide(6, 0));
        assertEquals("Деление на ноль", exception.getMessage());
        assertEquals(5, calculator.divide(10, 2));
    }
}