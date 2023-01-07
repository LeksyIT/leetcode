package com.leksy.leetcode.medium.longest_common_subsequence_1143;

public class Solution {

  public static void main(String[] args) {
    longestCommonSubsequence("adeaaaa", "ade" );
  }

  public static int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length(), n = text2.length();
    if(m == 0 || n == 0) return 0;
    int[][] dp = new int[m][n];
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        if(text1.charAt(i) == text2.charAt(j)) {
          dp[i][j] = (i > 0 && j > 0? dp[i - 1][j - 1]: 0) + 1;
          break;
        }else {
          dp[i][j] = Math.max((i > 0? dp[i - 1][j]: 0), (j > 0? dp[i][j - 1]: 0));
        }
      }
    }
    return dp[m - 1][n - 1];
  }
}
