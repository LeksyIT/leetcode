package com.leksy.leetcode.medium.permutation_in_string_567;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public static void main(String[] args) {
    checkInclusion("ab", "eidboaoo");
  }

  public static boolean checkInclusion1(String s2, String s1) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s2.length(); i++) {
      map.merge(s2.charAt(i), 1, Integer::sum);
    }
    int j = 0;
    int i = -1;
    while (i < s1.length()) {
      i++;
      Character elI = s1.charAt(i);
      int prev = map.merge(elI, -1, Integer::sum);
      if (prev == 0 || !map.containsKey(elI)) {
        while (map.merge(elI, 1, Integer::sum) != 0) {
          j++;
        }
      }
      if (i - j == s2.length()) {
        return true;
      }
    }
    return i - j == s2.length();
  }

  public static boolean checkInclusion(String s1, String s2) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      map.merge(s1.charAt(i), -1, Integer::sum);
    }
    for (int l = 0, r = 0; r < s2.length(); r++) {
      if (map.merge(s2.charAt(r), 1, Integer::sum) > 0) {
        while (map.merge(s2.charAt(l++), -1, Integer::sum) != 0) {
        }
      } else if ((r - l + 1) == s1.length()) {
        return true;
      }
    }
    return false;
  }
}
