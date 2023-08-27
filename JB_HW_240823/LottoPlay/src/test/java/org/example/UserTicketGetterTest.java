package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayInputStream;

public class UserTicketGetterTest {
  private ByteArrayInputStream inputStream; // эмуляция ввода пользователя

  @Before
  public void setUp() {
    String input = "1\n2\n3\n4\n5\n"; // Подготавливаем ввод пользователя
    inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream); // Перенаправляем System.in
    System.out.println("Тест начат:");
  }
  @After   // Вызывается после каждого теста
  public void after() {
    System.out.println("Тест пройден");
  }
  @Test//тест на правильное считывание методом getTicket
  public void testValidTicketInput() {
    int[] expectedTicket = {1, 2, 3, 4, 5};// ожидаемый результат
    int[] actualTicket = UserTicketGetter.getTicket();
    Assert.assertArrayEquals(expectedTicket, actualTicket);
    System.out.println("Тест на правильное считывание методом getTicket(Перенаправляем System.in)");
  }
}
