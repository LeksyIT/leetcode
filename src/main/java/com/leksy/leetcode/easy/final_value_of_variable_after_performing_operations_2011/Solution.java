package com.leksy.leetcode.easy.final_value_of_variable_after_performing_operations_2011;

public class Solution {

  public static void main(String[] args) {
    finalValueAfterOperations(new String[]{"--X", "X++", "X++"});
  }

  public static int finalValueAfterOperations(String[] operations) {
    int result = 0;
    for (String element : operations) {
      if ("++X".equals(element) || "X++".equals(element)) {
        result++;
      } else {
        result--;
      }
    }
    return result;
  }
}
