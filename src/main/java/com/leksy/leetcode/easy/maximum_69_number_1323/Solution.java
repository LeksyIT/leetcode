package com.leksy.leetcode.easy.maximum_69_number_1323;

public class Solution {

  public static void main(String[] args) {
    System.out.println(maximum69Number(9669));
  }

  public static int maximum69Number(int num) {
    int changeNum = 0;
    int counter = 1;
    while (num > counter) {
      if ((num / counter) % 10 == 6) {
        changeNum = counter;
      }
      counter *= 10;
    }
    return num + 3 * changeNum;
  }
}
