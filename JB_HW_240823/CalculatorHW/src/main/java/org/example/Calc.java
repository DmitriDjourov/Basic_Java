package org.example;
import java.util.Scanner;
public class Calc {
  public static void run() {

    System.out.println(" * Простой калькулятор * ");
    System.out.println("Выберите операцию: +, -, *, /, %, ^");

    boolean flag = true;

    while (flag) {
      double num1 = ScannerSingleton.getNumberInput("Введите первое число: ");

      char operator = ScannerSingleton.getOperatorInput("Введите желаемую операцию (+, -, *, /, %, ^): ");

      double num2 = ScannerSingleton.getNumberInput("Введите второе число: ");
/*
      №2
      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите выражение как в примере (Пример : '2 + 3 =' ) соблюдая пробелы: ");
      String expression = scanner.nextLine();

      String[] elements = expression.split(" ");
      double num1 = Double.parseDouble(elements[0]);
      char operator = elements[1].charAt(0);
      double num2 = Double.parseDouble(elements[2]);*/

      double result = 0;

      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            System.out.println("На ноль делить нельзя!");
            return;
          }
          break;
        case '%':
          result = num1 % num2;
          break;
        case '^':
          System.out.print("Введите степень: ");
          result = Math.pow(num1, num2);
          break;
        default:
          System.out.println("Что-то пошло не так...");
          return;
      }
      System.out.printf("Результат: %.2f\n", result);
      flag = ScannerSingleton.yesOrNo("Хотите продолжить вычисления? Y или N");
    }
    System.out.println("Был рад помочь , приходите ещё :))) ");
  }
}
