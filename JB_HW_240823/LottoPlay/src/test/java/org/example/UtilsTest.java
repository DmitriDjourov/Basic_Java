package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class UtilsTest {
  @After   // Вызывается после каждого теста
  public void afterEach() {
    System.out.println("Тест пройден");
  }
  @BeforeAll // Вызывается один раз в начале тестирования
  public static void beforeAll() { // static - добавляет метод в Metaspace, он будет единым для всех объектов тестирования
    System.out.println("Начато тестирование:");
  }
  @Before  // Вызывается перед каждым теста
  public void beforeEach() {
    System.out.println("Тест начат:");
  }
  @AfterAll // Вызывается один раз в начале тестирования
  public static void afterAll() {
    System.out.println("Тестирование закончено.");
  }
  @Test //тест на отсутствие совпадений
  public void testNoMatches() {
    int[] generateNum = {6, 7, 8, 9, 5}; // дано
    int[] userNum = {36, 37, 38, 39, 40}; // дано
    int hitCount = 0; // ожидаемое
    System.out.println("Тестируем отсутствие совпадении");
    int actualCounter = Utils.hitCounter(generateNum, userNum); // фактическое
    Assert.assertEquals(hitCount, actualCounter); // сравниваем между собой
  }

  @Test // тест на полное совпадение
  public void testFullMatches(){
    int[] generateNum = {6, 7, 8, 9, 5}; // дано
    int[] userNum = {6, 7, 8, 9, 5}; // дано
    int hitCount = 5; // ожидаемое
    System.out.println("Тестируем полное совпадение");
    int actualCounter = Utils.hitCounter(generateNum, userNum); // фактическое
    Assert.assertEquals(hitCount, actualCounter); // сравниваем между собой
  }  @Test // тест на смешанное совпадение
  public void testMixMatches(){
    int[] generateNum = {1, 2, 3, 4, 5}; // дано
    int[] userNum = {5, 7, 3, 8, 1}; // дано
    int hitCount = 3; // ожидаемое
    System.out.println("Тестируем смешанное совпадение");
    int actualCounter = Utils.hitCounter(generateNum, userNum); // фактическое
    Assert.assertEquals(hitCount, actualCounter); // сравниваем между собой
  }
  @Test // тест на пустые массивы
  public void testNullArrays(){
    int[] generateNum = {}; // дано
    int[] userNum = {}; // дано
    int hitCount = 0; // ожидаемое
    System.out.println("Тестируем на пустые массивы");
    int actualCounter = Utils.hitCounter(generateNum, userNum); // фактическое
    Assert.assertEquals(hitCount, actualCounter); // сравниваем между собой
  }
}