package org.example;

public class Converter {
    // Метод для конвертации из градусов по Цельсию в Кельвины
    public static double runKelvinConverter(double celsius){
        // Формула для конвертации: Кельвины = Цельсий + 273.15
        return celsius + 273.15;
    }
    // Метод для конвертации из градусов по Цельсию в Фаренгейты
    public static double runFahrenheitConverter(double celsius) {
        // Формула для конвертации: Фаренгейты = (Цельсий * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }

}
