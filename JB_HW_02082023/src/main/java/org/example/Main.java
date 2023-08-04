package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //=============================== 1 ==================================
/*        1.
        Реализовать программу, выводящую на экран результаты:
        Сложения двух чисел
        Вычитания двух чисел
        Умножения двух чисел
        Деления двух чисел
        Каждая из арифметических операций должна быть реализована как отдельный метод.*/
/*
        int a = 2;
        int b = 10;

        //Сложения двух чисел
        HiburShteyMisparim(a, b);
        //Вычитания двух чисел
        HisurShteyMisparim(a, b);
        // Умножение двух чисел
        KafulShteyMisparim(a, b);
        // Деление двух чисел
        HilukShteyMisparim(a, b);
    }

    //Метод сложения двух чисел
    public static void HiburShteyMisparim(int n, int m) {
        System.out.println("Сумма чисел равна " + (m + n));
    }

    //Метод вычитания двух чисел
    public static void HisurShteyMisparim(int n, int m) {
        System.out.println("Разность двух чисел равна " + (m - n));
    }

    // Метод умножения двух чисел
    public static void KafulShteyMisparim(int n, int m) {
        System.out.println("Произведение двух чисел равно " + (m * n));
    }

    // Метод деления двух чисел
    public static void HilukShteyMisparim(int n, int m) {
        System.out.println("При делении двух чисел мы получаем " + (m / n));
    }
}*/
        //=============================== 2 ==================================
//    №2
//  ** Дописать метод конвертации числа из любой системы счисления в десятичную
/*
        String number = "1A7B";
        int base = 16;
        int decimalVal = converToDec(number, base);
        System.out.println("Число " + number + "в десятичной системе исчесления: " + decimalVal);
    }

    public static int converToDec(String number, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Неподдерживаемая система счисления: " + base);
        }
        int res = 0;
        int power = 1;

        // обрабатываю символы числа справа на лево
        for (int i = number.length() - 1; i >= 0; i--) {
            char ch = number.charAt(i);

            int digitValue = Character.digit(ch, base);

            if (digitValue == -1) {
                throw new IllegalArgumentException("Некорректный символ для системы счисления: " + ch);
            }
            res = res + digitValue * power;
            power = power * base;
        }
        return res;
    }
}*/
        //=================================================================
/*
        Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты:
        У класса должны быть методы для конвертации.
                Реализуйте два метода в классе:
        runKelvinConverter(double baseValue)
        runFahrenheitConverter(double baseValue)*/
/*
        double celsiusValue = 25.0;

        double kelvinValue = Converter.runKelvinConverter(celsiusValue);
        System.out.println(celsiusValue + " градусов по Цельсию равны " + kelvinValue + " Кельвинам.");

        double fahrenheitValue = Converter.runFahrenheitConverter(celsiusValue);
        System.out.println(celsiusValue + " градусов по Цельсию равны " + fahrenheitValue + " Фаренгейтам.");

    }
}*/
        //=================================================================
/*
        Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся в двух переменных
        с помощью третьей переменной:
        На вход: а = 2; b = 5;
        На выход: a = 5; b = 2;
        Используйте переменную temp;*/
        int a = 2;
        int b = 5;

        System.out.println(" a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a = " + a + ", b = " + b);
    }

}