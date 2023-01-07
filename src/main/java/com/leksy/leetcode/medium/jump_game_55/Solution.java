package com.leksy.leetcode.medium.jump_game_55;

class Solution {

  public static void main(String[] args) {
    canJump(new int[]{2, 3, 1, 1, 4});
  }

  public static boolean canJump(int[] nums) {
    int goal = nums.length - 1;
    int i = goal - 1;
    while (i >= 0) {
      if (i + nums[i] >= goal) {
        goal = i;
      }
      i--;
    }
    return goal == 0;
  }
}
