package com.leksy.leetcode.easy.isomorphic_strings_205;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public static void main(String[] args) {
    System.out.println(isIsomorphic("abc", "bac"));
    System.out.println(isIsomorphic1());
  }

  public static boolean isIsomorphic(String s, String t) {
    Map<Character, Integer> fromSToT = new HashMap<>();
    Map<Character, Integer> fromTToS = new HashMap<>();
    for (Integer i = 0; i < s.length(); ++i) {
      if (fromSToT.put(s.charAt(i), i) != fromTToS.put(t.charAt(i), i)) {
        return false;
      }
    }
    return true;
  }

  public static String isIsomorphic1() {
    int maxNum = 1;
    return maxNum == 0 ? "NO" : "YES\n" + +(maxNum + 1);
  }

}
