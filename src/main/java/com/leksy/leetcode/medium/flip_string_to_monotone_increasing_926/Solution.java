package com.leksy.leetcode.medium.flip_string_to_monotone_increasing_926;

public class Solution {

  public static void main(String[] args) {
    System.out.println(minFlipsMonoIncr("001101000"));
  }

  public static int minFlipsMonoIncr(String s) {
    int ans = 0, noOfFlip = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        ans = Math.min(noOfFlip, ans + 1);
      } else {
        noOfFlip++;
      }
    }
    return ans;
  }
}
