package com.leksy.leetcode.medium.house_robber_198;

public class Solution {

  public static void main(String[] args) {
    rob(new int[]{3, 2, 1, 2, 1, 4});
  }

  public static int rob(int[] nums) {
    int even = 0;
    int odd = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (i%2 == 0){
        even = Math.max(even+nums[i],odd);
        nums[i] = even;
      } else{
        odd = Math.max(odd+nums[i],even);
        nums[i] = odd;
      }
    }
    return Math.max(even,odd);
  }
}
