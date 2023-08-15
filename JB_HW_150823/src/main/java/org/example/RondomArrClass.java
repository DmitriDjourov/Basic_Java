package org.example;

import java.util.Random;

public class RondomArrClass {
  /**
   * @param countNumbers 8
   * @param startNum     1
   * @param endNum       50
   * @return array
   */
  //Метод создающий массив,принимающий параметры из класса Main (RondomArrClass.createRondomArray(8,1,50);)
  public static int[] createRondomArray(int countNumbers, int startNum, int endNum) {
    // создаем массив array и выделяем под него место в памяти
    int[] array = new int[countNumbers];
    // создаем random и выделяем под него место в памяти
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      // заполняем массив array рандомными числами от 1 (startNum) до 50 (endNum)
      array[i] = random.nextInt(endNum - startNum + 1) + startNum;
    }
    return array; // возвращаем массив в класс Main
  }

  // метод для вывода массива на печать в консоль. Метод принимает массив из класса Main
  public static void printNewArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // метод для замены каждого элемента с нечетным индексом на ноль.
  public static int[] replaceOddNumbers(int[] array) {
    for (int a = 0; a < array.length; a += 2) {
      array[a] = 0;
    }
    return array;
  }

  //Задание №2. метод для определения и вывода на экран сообщения о том, является ли массив строго возрастающей последовательностью.
  public static void checkNumbersIncerding(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] <= array[i - 1]) {
        System.out.println("Массив не является строго возрастающей последовательностью.");
        return;
      }
    }
    System.out.println("Массив является строго возрастающей последовательностью.");
  }
}
