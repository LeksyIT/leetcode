package com.leksy.leetcode.easy.check_if_one_string_swap_can_make_strings_equal_1790;

public class Solution {

  public boolean areAlmostEqual(String s1, String s2) {
    int swapIndex = -1;
    int swapCount = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        swapCount++;
        if (swapCount > 2) {
          return false;
        }
        if (swapIndex == -1) {
          swapIndex = i;
        } else if (s1.charAt(i) != s2.charAt(swapIndex) || s2.charAt(i) != s1.charAt(swapIndex)) {
          return false;
        }
      }
    }
    return swapCount != 1;
  }
}
