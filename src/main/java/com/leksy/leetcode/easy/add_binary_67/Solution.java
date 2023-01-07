package com.leksy.leetcode.easy.add_binary_67;

public class Solution {

  public static void main(String[] args) {
    addBinary("1110110101", "1110111011");
  }

  public static String addBinary(String a, String b) {
    long sum = Long.parseLong(a) + Long.parseLong(b);
    long i = 10;
    long newInt = 0;
    while (sum > 0) {
      long val = sum % 10;
      newInt += (val % 2) * i/10;
      sum /= 10;
      sum += val / 2;
      i *= 10;
    }
    return String.valueOf(newInt);
  }
}
