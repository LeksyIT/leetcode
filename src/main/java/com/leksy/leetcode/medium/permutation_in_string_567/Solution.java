package com.leksy.leetcode.medium.permutation_in_string_567;

class Solution {

  public static void main(String[] args) {
    checkInclusion("aoboo", "aooeidbaooo");
  }

  public static boolean checkInclusion(String s1, String s2) {
    int[] count = new int[32];
    for (int i = 0; i < s1.length(); i++) {
      count[s1.charAt(i)-97]--;
    }
    for (int l = 0, r = 0; r < s2.length(); r++) {
      if (++count[s2.charAt(r)-97] > 0) {
        while (--count[s2.charAt(l++)-97] != 0) {
          /* Moving to the moment when the condition is met */
        }
      } else if ((r - l + 1) == s1.length()) {
        return true;
      }
    }
    return s1.length() == 0;
  }
}
