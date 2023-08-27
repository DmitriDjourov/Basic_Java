package org.example;

import java.util.Scanner;

public class ScannerSingleton {
  private static Scanner scanner = new Scanner(System.in);


  public static double getNumberInput(String message) {
    double number;

    while (true) {
      System.out.print(message);
      if (scanner.hasNextDouble()) {
        number = scanner.nextDouble();
        break;
      } else {
        System.out.println("Некорректный ввод. Пожалуйста, введите другое число.");
        scanner.next(); // Очищаем буфер после некорректного ввода
      }
    }

    return number;
  }

  public static char getOperatorInput(String message) {
    char operator;

    while (true) {
      System.out.print(message);
      String input = scanner.next();

      if (input.length() == 1 && "+-*/%^".contains(input)) {
        operator = input.charAt(0);
        break;
      } else {
        System.out.println("Недопустимая операция. Пожалуйста, введите один из этих символов: +, -, *, /, %, ^");
      }
    }

    return operator;
  }

  public static boolean yesOrNo(String message) {
    boolean cont = false;

    System.out.println(message);
    String input = scanner.next();

    if(input.equals("Y") || input.equals("y")) {
      cont = true;
    } else {
      scanner.close();
    }

    return cont;
  }
}
