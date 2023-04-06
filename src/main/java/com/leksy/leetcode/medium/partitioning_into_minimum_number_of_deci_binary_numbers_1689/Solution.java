package com.leksy.leetcode.medium.partitioning_into_minimum_number_of_deci_binary_numbers_1689;

public class Solution {

  public static void main(String[] args) {
    minPartitions("312514251");
  }

  public static int minPartitions(String n) {
    int max = 48;
    for (int i = 0; i < n.length(); i++) {
      max = Math.max(n.charAt(i), max);
    }
    return max - 48;
  }
}
