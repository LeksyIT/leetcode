package com.leksy.leetcode.easy.сlimbing_stairs_70;

class Solution {

  public int climbStairs(int n) {
    int prev = 0;
    int prevPrev = 1;
    int current = 0;
    for (int i = 0; i < n; i++) {
      current = prev + prevPrev;
      prev = prevPrev;
      prevPrev = current;
    }
    return current;
  }
}
