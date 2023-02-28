package com.leksy.leetcode.easy.number_of_1_bits_191;

public class Solution {

  public static void main(String[] args) {
    hammingWeight(00000000000000000000000000001011);
  }

  public static int hammingWeight(int n) {
    int result = 0;
    while (n != 0) {
      result += (n & 1) == 1 ? 1 : 0;
      n = n >>> 1;
    }
    return result;
  }
}
