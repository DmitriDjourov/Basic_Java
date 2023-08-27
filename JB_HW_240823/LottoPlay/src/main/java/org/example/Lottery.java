package org.example;

import java.util.Arrays;

class Lottery {
  /*  int[] lotteryTicket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    int[] userLotteryTicket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    int[] userLotteryTicket2 = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    int[] userLotteryTicket3 = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];*/
  int[] lotteryTicket = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
  int[][] userLotteryTickets;

  public void start() {
    lotteryTicket = TicketGenerator.getTicket();
    System.out.println();
    System.out.println("* Система распределила билеты *");
    System.out.println();
  }

  public void getTicketByUser(int numPlayers) {
    userLotteryTickets = new int[numPlayers][Settings.COUNT_LOTTERY_SIZE_NUMBER];
    for (int i = 0; i < numPlayers; i++) {
      userLotteryTickets[i] = UserTicketGetter.getTicket();
      System.out.println("Игрок " + (i + 1) + " ввёл свои номера");
    }
/*    userLotteryTicket = UserTicketGetter.getTicket();
    System.out.println("Игрок 1 ввёл номера");
    userLotteryTicket2 = UserTicketGetter.getTicket();
    System.out.println("Игрок 2 ввёл номера");
    userLotteryTicket3 = UserTicketGetter.getTicket();
    System.out.println("Игрок 3 ввёл номера");*/
    //System.out.println("Пользователь ввёл билет");
  }

  public void check() {

 /*   int[] ticketGenerator = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];
    int[] ticketUser = new int[Settings.COUNT_LOTTERY_SIZE_NUMBER];

    System.out.println("Выигрышные номера : ");
    //   System.out.println(Arrays.toString(lotteryTicket));
    ticketGenerator = lotteryTicket;
    System.out.println(Arrays.toString(ticketGenerator));

    //System.out.println("Ваши номера : ");
    //public class Winn (int num_player,int[] userLotteryTicket,int[] ticketGenerator)
    Winn.winn(1, userLotteryTicket, ticketGenerator);
    Winn.winn(2, userLotteryTicket2, ticketGenerator);
    Winn.winn(3, userLotteryTicket3, ticketGenerator);*/

    int[] ticketGenerator = Arrays.copyOf(lotteryTicket, Settings.COUNT_LOTTERY_SIZE_NUMBER);

    System.out.println("Выигрышные номера : ");
    System.out.println(Arrays.toString(ticketGenerator));

    for (int i = 0; i < userLotteryTickets.length; i++) {
      Winn.winn(i + 1, userLotteryTickets[i], ticketGenerator);
    }
  }
}