package com.leksy.leetcode.easy.valid_perfect_square_367;

public class Solution {

  public static void main(String[] args) {
    isPerfectSquare(2147483647);
  }

  public static boolean isPerfectSquare(int num) {
    int left = 1;
    int right = Math.min(46340, num);
    while (right >= left) {
      int cur = left + (right - left) / 2;
      int sqrt = cur * cur;
      if (sqrt > num) {
        right = cur - 1;
      } else if (sqrt < num) {
        left = cur + 1;
      } else {
        return true;
      }
    }
    return false;
  }
}
