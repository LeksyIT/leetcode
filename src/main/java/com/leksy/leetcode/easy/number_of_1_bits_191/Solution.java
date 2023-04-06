package com.leksy.leetcode.easy.number_of_1_bits_191;

public class Solution {

  public static void main(String[] args) {
    hammingWeight(123);
  }

  public static int hammingWeight(int n) {
    int result = 0;
    while (n != 0){
      if ((n&1) == 1){
        result+=1;
      }
      n>>>=1;
    }
    return result;
  }
}
