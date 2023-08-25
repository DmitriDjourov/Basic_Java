package org.example;

public class Utils {
  public static int hitCounter(int[] lotteryNumber, int[] userNumber) {
    int count = 0;
    for (int i = 0; i < lotteryNumber.length; i++) {
      for (int j = 0; j < userNumber.length; j++) {
        if (lotteryNumber[i] == userNumber[j]) {
          count++;
          break;
        }
      }
    }
    return count;
  }
}
