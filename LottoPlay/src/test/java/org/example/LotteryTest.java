package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class LotteryTest {
  private Lottery lottery;
  @Before
  public void setUp() {
    lottery = new Lottery();
    Settings.COUNT_LOTTERY_SIZE_NUMBER = 5;
    System.out.println("Тест начат:");
  }
  @After   // Вызывается после каждого теста
  public void after() {
    System.out.println("Тест пройден");
  }
  @Test // тест на генерацию номера системой
  public void testStart() {
    System.out.println("Тест на генерацию номера системой");
    lottery.start();
  }
  @Test //тест на проверку выигрыша
  public void testCheck() {
    lottery.lotteryTicket = new int[]{1, 2, 3, 4, 5};
    int[] userTicket = new int[]{1, 2, 3, 4, 5};
    System.out.println("Тест на проверку выигрыша");
    lottery.userLotteryTickets = new int[][]{userTicket};
    lottery.check();
  }


}