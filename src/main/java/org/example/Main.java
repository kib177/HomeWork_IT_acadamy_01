package org.example;

import java.sql.SQLOutput;

/**
     * Тестовое задание дял реализации javadoc, javadoc site и JaCoCo
     * @author Kirill Brigi
     * @version 1.0
     */

    public class Main {
        public static void main(String[] args) throws Exception {
            Calcul calc = new Calcul();

        System.out.println(calc.add(1, 2) + " " + calc.subtract(1, 2) + " " +
            calc.multiply(1, 2) + " " + calc.divide(1, 2));

            Stroka stroka = new Stroka();

            System.out.println(stroka.DeleteNumber("kjf45uyt8934rrt2") + " \n" +
                    stroka.DeleteSpace(" Все    в    мире знают, JAVA   топ  ") + " \n" +
                    stroka.Number("kjf45uyt8934rrt2"));
        }
    }
