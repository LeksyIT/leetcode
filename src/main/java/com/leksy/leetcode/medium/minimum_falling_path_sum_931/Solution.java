package com.leksy.leetcode.medium.minimum_falling_path_sum_931;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    minFallingPathSum(a);
  }

  public static int minFallingPathSum(int[][] array) {
    int n = array.length;
    for (int i = 1; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        int minOfAbove3 = array[i - 1][j];
        if (j > 0 && array[i - 1][j - 1] < minOfAbove3) {
          minOfAbove3 = array[i - 1][j - 1];
        }
        if (j + 1 < n && array[i - 1][j + 1] < minOfAbove3) {
          minOfAbove3 = array[i - 1][j + 1];
        }
        array[i][j] += minOfAbove3;
      }
    }
    return Arrays.stream(array[n - 1]).min().getAsInt();
  }
}
