package com.leksy.leetcode.easy.richest_customer_wealth_1672;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
  public static void main(String[] args) {
    maximumWealth(new int[][]{{1,2,3},{3,2,2},{3,3,3}});
  }

  public static int maximumWealth(int[][] accounts) {
    int ans = 0;
    for (int i=0; i<accounts.length; i++) {
      int ansLocal = 0;
      for (int j=0; j<accounts[i].length; j++) {
        ansLocal+=accounts[i][j];
      }
      ans = Math.max(ans, ansLocal);
    }
    return ans;
  }
}
