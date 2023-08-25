package org.example;

import java.util.Random;

class TicketGenerator {
  static Random random = new Random();

  public static int[] getTicket() {
    int[] ticket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    for (int i = 0; i < ticket.length; i++) {
      ticket[i] = random.nextInt(1, 50);
    }
    return ticket;
  }
}
