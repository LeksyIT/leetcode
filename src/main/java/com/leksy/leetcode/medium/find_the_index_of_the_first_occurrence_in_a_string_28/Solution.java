package com.leksy.leetcode.medium.find_the_index_of_the_first_occurrence_in_a_string_28;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public static void main(String[] args) {
    strStr("hello", "ll");
  }

  public static int strStr(String haystack, String needle) {
    Map<Character, Integer> needChar = new HashMap<>();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < needle.length(); i++) {
      needChar.merge(needle.charAt(i), 1, Integer::sum);

    }
    for (int i = 0, j = 0; i < haystack.length(); i++) {
      int el = needChar.merge(haystack.charAt(i), -1, Integer::sum);
      result.append(haystack.charAt(i));
      if (el < 0) {
        result.deleteCharAt(0);
        while (needChar.merge(haystack.charAt(j++), 1, Integer::sum) != 0) {
          result.deleteCharAt(0);
        }
      }
      if (needle.equals(result.toString())) {
        return j;
      }
    }
    return -1;
  }
}
