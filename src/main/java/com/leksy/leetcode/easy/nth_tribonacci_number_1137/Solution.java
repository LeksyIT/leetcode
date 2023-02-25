package com.leksy.leetcode.easy.nth_tribonacci_number_1137;

public class Solution {

  public static void main(String[] args) {
    tribonacci(4);
  }

  public static int tribonacci(int n) {
    int first = 0;
    int second = 1;
    int third = 1;
    int curr = n == 0 ? n : 1;
    for (int i = 0; i < n - 2; i++) {
      curr = first + second + third;
      first = second;
      second = third;
      third = curr;
    }
    return curr;
  }
}
