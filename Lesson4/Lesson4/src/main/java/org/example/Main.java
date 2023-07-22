package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. о строках

        String str = "Маша ела кашу";
        System.out.println(str);
        //                               0123456789
        String str1 = new String("Маша ела кашу!");
        System.out.println(str1); // вывод в терминал
        int count = str1.length(); // длина строки
        System.out.println("length str1 =  " + count);
        char c = str1.charAt(0);// СИмвол строки, индексы с нуля
        System.out.println(c);

        char lastCharacter = str1.charAt(count - 1); // charAt - получение символа по индексу
        System.out.println(lastCharacter);

        String subStr1 = str1.substring(5); // substring - получение подстроки начиная с 5 символа до конца
        System.out.println(subStr1);
        String subStr2 = str1.substring(5, 8);// substring - получение подстроки начиная с 5 символа до 8
        System.out.println(subStr2);
        int pos = str.indexOf("ела"); // ищет первое вхождение подстроки "ела" в строке str
        System.out.println("indexOf = " + pos);

        //        2. Логика
        boolean flag1 = true;
        boolean flag2 = false;

        int a = 1;
        int b = 2;
        boolean flag3 = a > b;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // Логические операции
        // Логические И // КОНЪЮНКИЦИЯ - истина оба истины
        //
        boolean flag4 =  (a > b) && flag1;
        // ИЛИ // ДИЗЪЮНКИЦЯ - ложно оба ложны
        boolean flag5 =  (a > b) || flag1;
        // НЕ - ИНВЕРСИЯ - истина исходное ложно

        boolean flag6 = !flag5;
        //


        //        3. Введение в ветвления
        //        if(УСЛОВИЕ ЛОГИЧЕСКОЕ возвращает boolean){
        //
        //        }
        //        else{
        //
        //        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("max x = " + x);
        } else  {
            System.out.println("max y = " + y);
        }

        // 4. Введение в циклы
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 5. массивы
//        let array = [];
//        String[] arrayStr = new String[size];
        int size = 10;
        // заполнить массив четным числами
        int[] arrayInt = new int[size]; // 0..9

        for (int i = 0; i < size; i++) {
            arrayInt[i] = i * 2;
//            System.out.println(arrayInt[i]);
        }

        System.out.println(Arrays.toString(arrayInt));
    }
}