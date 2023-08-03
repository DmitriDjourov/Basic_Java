package org.example;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//============================= 1 ============================================================================
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.

/*      double m = 10.5;
        double n = 10.45;
    // вызываем метод для сравнения номеров и возврата ближаайшего к 10
        double misparKarovLeEsser = hipusHaMispar(m, n);
    // печатаем ответ
        System.out.println("Число " + misparKarovLeEsser + " находится к 10 ближе");
    }
    // метод для сравнения номеров и возврата ближайшего к 10
    public static double hipusHaMispar(double m, double n) {
        double evdelBenEsserVeN = Math.abs(10 - n);
        double evdelBenEsserVeM = Math.abs(10 - m);

        if (evdelBenEsserVeM < evdelBenEsserVeN) {
            return m;
        } else {
            return n;
        }
    }
}*/
//============================= 2 ============================================================================
/*
№2      Есть устройство,на табло которого показывается количество секунд,оставшихся до конца рабочего дня.Когда рабочий
        день начинается ровно в 9часов утра — табло отображает «28800» (т.е.остаётся 8часов),когда 14:30 — на табло
        «9000» (т.е.остаётся два с половиной часа),а когда наступает 17часов — на табло отображается «0» (т.е.рабочий
        день закончился).
        Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
        Требуется написать программу,которая вместо секунд будет выводить на табло понятные фразы с информацией о
        том,сколько полных часов осталось до конца рабочего дня.
        Например: «осталось 7часов», «осталось 4часа», «остался 1час», «осталось менее часа».
        Объяснение:в переменную n должно записываться случайное(на время тестирования программы)целое число из
        диапазона от 0до 28800,далее оно должно выводиться на экран(для тех,кто понимает в секундах)и на следующей
        строке(для тех кто не понимает)должна выводиться фраза о количестве полных часов,содержащихся в n секундах.

*/
        //Присваиваем случайное число
/*
        Random random = new Random();
        int n = random.nextInt(28801);

        //Выводим на табло для понимающих
        System.out.println("До конца рабочего дня осталось: " + n + " секунд. ");

        // Преобразуем секунды  в часы и минуты
        int misparShaot = n / 3600;
        int misparDakot = (n % 3600) / 60;

        //Печатаем информацию о полных часах и минутах
        if (misparShaot > 0) {
            System.out.print("Осталось " + misparShaot + " час");
            if (misparShaot > 1) {
                System.out.print("а");
            }
        } else {
            System.out.print("Осталось менее часа");
        }
        if (misparDakot > 0 && misparShaot > 0) {
            System.out.print(" и " + misparDakot + " минут до конца рабочего дня");
        }
        System.out.print(".");
    }
}*/
//============================= 3 ============================================================================
/*
№3
        Реализуйте метод isLeapYear(), которая определяет, является ли год високосным. Если год високосный,
                функция должна вернуть true, если нет – false. Год считается високосным, если он кратен
        (то есть делится без остатка) 400 или он одновременно кратен 4 и не кратен 100. Как видите,
        в определении уже заложена вся необходимая логика, осталось только переложить её на код:
        isLeapYear(2018); // false
        isLeapYear(2017); // false
        isLeapYear(2016); // true
        */
/*
        System.out.println(isLeapYear(2018));// false
        System.out.println(isLeapYear(2017));// false
        System.out.println(isLeapYear(2016));// true
    }
//    Год 2018: Мы делим его на 4 и получаем остаток. Если остаток равен 0, значит год високосный.
//    Но в нашем случае, остаток не равен 0 (2 остается), поэтому год 2018 - не високосный.
//    Год 2017: Опять делим на 4, но получаем остаток 1. Здесь тоже год не является високосным.
//    Год 2016: При делении на 4, остаток равен 0. Значит, год 2016 - високосный год
//    Если год делится на 100 без остатка, то он не является високосным.
//    Но есть исключение для этого правила: если год делится на 400 без остатка, то он все равно считается високосным.
    public static boolean isLeapYear(int shana) {
        if ((shana % 400 == 0) || ((shana % 4 == 0) && (shana % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}*/
//============================= 4 ============================================================================
/*
№4      Реализуйте метод getLetter(), которая извлекает из переданной строки указанный символ (по порядковому номеру, а
        не индексу)и возвращает его наружу.Если такого символа нет, то функция возвращает пустую строку.

        Примеры вызова:
        string name = "qwerty";

// Обычное обращение вызывает exception
*name[11]; // exception

// 11 символ соответствует 10 индексу
        getLetter(name, 11); // ""

        getLetter(name, 1); // "q"
        getLetter(name, 0); // ""
        getLetter(name, 6); // "y"
*/
        String name = "gwerty";
        System.out.println(getLetter(name, 11)); //""
        System.out.println(getLetter(name, 1));  // "q"
        System.out.println(getLetter(name, 0));  // ""
        System.out.println(getLetter(name, 6));  // "y"
    }

    // метод который извлекает из переданной строки указанный символ
    public static String getLetter(String shem, int makom) {
        if (makom <= 0 || makom > shem.length()) {
            return "";
        }
        return String.valueOf(shem.charAt(makom - 1));
    }
}
