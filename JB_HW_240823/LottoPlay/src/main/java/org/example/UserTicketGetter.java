package org.example;

import java.util.HashSet;
import java.util.Scanner;

class UserTicketGetter {
  static Scanner scanner = new Scanner(System.in);
  public static int numberOfPlayers(){
    System.out.print("Введите количество участников лотереи: ");
    int numberPlayers = scanner.nextInt();
    return numberPlayers;
  }
  public static int[] getTicket() {
    int[] ticket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    int numberTemp;
    HashSet<Integer> uniqNum = new HashSet<>();

    System.out.println("Введите 5 чисел от 1 до 50: ");

    for (int i = 0; i < ticket.length; i++) {
      numberTemp = scanner.nextInt();

      if (numberTemp > 0 && numberTemp <= 50 && uniqNum.add(numberTemp)) {
        ticket[i] = numberTemp;
      } else {
        if (!uniqNum.add(numberTemp)) {
          System.out.println("Вы ввели число которое уже вводили , введите другое число:");
        } else {
          System.out.println("Вы ввели некорректное число , введите повторно число между 1 и 50 :");
        }
        i--;
      }
    }
    //System.out.println(Arrays.toString(ticket));
    return ticket;
  }
}
/*
class UserTicketGetter {
  static Random random = new Random();

  public static int[] getTicket() {
    int[] ticket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    for (int i = 0; i < ticket.length; i++) {
      ticket[i] = random.nextInt(1, 50);
    }
    return ticket;
  }
}*/