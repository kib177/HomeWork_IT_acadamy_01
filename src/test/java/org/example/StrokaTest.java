package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования класса Строка
 * @author Kirill Brigi
 */
public class StrokaTest {
    Stroka s = new Stroka();

    @Test
    @Timeout(5)
    @DisplayName("Тестирование метода подсчета цифр")
    void number() {
        assertEquals(7, s.Number("kjf45uyt8934rrt2"));
        assertEquals(8, s.Number("aaa3333aaa4444"));
    }

    @Test
    @Timeout(5)
    @DisplayName("Тестирование метода на удаление лишних пробелов")
    void deleteSpace() {
        assertEquals( "Все в мире знают, JAVA топ", s.DeleteSpace(" Все    в    мире знают, JAVA   топ  "));
        assertNotNull(s.DeleteSpace(" "));
        assertEquals("", s.DeleteSpace("      "));
    }

    @Test
    @Timeout(5)
    @DisplayName("Тестирование метода удаления цифр")
    void deleteNumber() {

        assertEquals("kjfuytrrt", s.DeleteNumber("kjf45uyt8934rrt2"));
        assertEquals("aaa", s.DeleteNumber("a2a2a3"));
    }
}