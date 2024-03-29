package com.leksy.leetcode.easy.sqrtx_69;

public class Solution {

  public static void main(String[] args) {
    mySqrt(8);
  }

  public static int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    int left = 1;
    int right = x;
    while (true) {
      int mid = left + (right - left) / 2;
      if (mid > x / mid) {
        right = mid - 1;
      } else {
        if (mid + 1 > x / (mid + 1)) {
          return mid;
        }
        left = mid + 1;
      }
    }
  }
}
