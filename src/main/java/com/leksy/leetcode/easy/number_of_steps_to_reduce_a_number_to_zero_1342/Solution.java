package com.leksy.leetcode.easy.number_of_steps_to_reduce_a_number_to_zero_1342;

public class Solution {

  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));
  }

  public static int numberOfSteps(int num) {
    int counter = 0;
    while (num != 0) {
      num = num % 2 == 0 ? num >> 1 : num - 1;
      counter++;
    }
    return counter;
  }
}
