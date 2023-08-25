package org.example;

import java.util.Arrays;

public class StartLottery {
  public static void main() {
    Lottery lottery = new Lottery();
    int numPlayers =0;

    lottery.start();
    numPlayers = UserTicketGetter.numberOfPlayers();
    lottery.getTicketByUser(numPlayers);
    lottery.check();
    //==============================================================
/*    System.out.println(" Тестовый режим лотереи:  * Без лоха - жизнь плоха * ");
    int[] ticketGenerator = {10, 20, 30, 40, 50};
    System.out.println("Выпавшие в розыгрыше числа : " + Arrays.toString(ticketGenerator));
    int[] ticketUser = {10, 20, 30, 40, 50};
    System.out.println("Ваши числа : " + Arrays.toString(ticketUser));
    int hit = Utils.hitCounter(ticketGenerator, ticketUser);
    System.out.println("Поздравляем! Вы угадали : " + hit + " из 5 !!! ");*/
  }
}

