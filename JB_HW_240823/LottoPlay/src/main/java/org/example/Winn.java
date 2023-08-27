package org.example;

import java.util.Arrays;

class Winn {
  public static void winn(int num_player, int[] userLotteryTicket, int[] ticketGenerator) {
    System.out.println("Номера игрока №" + num_player + " : ");
    int[] ticketUser = userLotteryTicket;
    System.out.println(Arrays.toString(ticketUser));
    // Сколько совпадений
    int hit = Utils.hitCounter(ticketGenerator, ticketUser);
    System.out.println("Количество совпадений :" + hit);
    System.out.println();
  }
}