package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("=============== В методе main инициализировать все примитивные типы и не примитивные типы. ======================");

        char Character = 'G';
        System.out.println("Character: "+ Character);
        int Integer = 89;
        System.out.println("Integer: "+ Integer);
        byte Byte = 4;
        System.out.println("Byte: "+ Byte);
        short Short = 56;
        System.out.println("Short: "+ Short);
        float Float = 4.7333436f;
        System.out.println("Float: "+ Float);
        double Double = 4.355453532;
        System.out.println("Double: "+ Double);
        long Long = 12121;
        System.out.println("Long: "+ Long);
        System.out.println("==============Дано трехзначное число. Вывести на экран все цифры этого числа.=======================");
        int number = 345;

        int digit1 = number / 100;
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;

        System.out.println("Число " + number + " -> " + digit1 + ", " + digit2 + ", " + digit3);

        }
    }
