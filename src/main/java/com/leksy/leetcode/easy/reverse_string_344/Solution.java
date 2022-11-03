package com.leksy.leetcode.easy.reverse_string_344;

public class Solution {

  public void reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char swapValue = s[s.length - i - 1];
      s[s.length - i - 1] = s[i];
      s[i] = swapValue;
    }
  }
}
