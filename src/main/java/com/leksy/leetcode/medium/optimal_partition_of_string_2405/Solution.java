package com.leksy.leetcode.medium.optimal_partition_of_string_2405;

public class Solution {

  public static void main(String[] args) {
    partitionString("hdklqkcssgxlvehva");
  }

  public static int partitionString(String s) {
    int[] resultArr = new int[26];
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result = Math.max(--resultArr[s.charAt(i) - 96], result);
    }
    return result;
  }
}
