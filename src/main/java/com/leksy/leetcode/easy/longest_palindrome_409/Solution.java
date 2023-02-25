package com.leksy.leetcode.easy.longest_palindrome_409;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public int longestPalindrome(String s) {
    int length = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (map.merge(s.charAt(i), 1, Integer::sum) % 2 == 0) {
        length++;
      }
    }
    return length % 2 == 0 && s.length() > length ? length + 1 : length;
  }
}
