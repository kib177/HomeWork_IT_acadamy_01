package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс обработки строк
 * @author Kirill Brigi
 */
public class Stroka {

    /**
     * Функция считает количество цифр в строке
     * @param str - входная строка пользователя
     * @return number - количество цифр
     */
    public int Number(String str){
        int number = 0;
        //String[] numbers = str.split("[0-9]"); некоректно работает ааа3333ааа4444 возвращает 5 а не 8
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            number++;
        }

        return number;
    }

    /**
     * Функция удаляет лишние пробелы в строке
     * @param str - входная строка пользователя
     * @return str - обработанная стрко
     */
    public String DeleteSpace(String str){

        return str.trim().replaceAll("\\s+", " ");
    }

    /**
     * Функция удаляет цифры из строки
     * @param str - входная строка пользователя
     * @return str - обработанная строко
     */
    public String DeleteNumber(String str){

        return str.replaceAll("[0-9]", "");
    }


}
