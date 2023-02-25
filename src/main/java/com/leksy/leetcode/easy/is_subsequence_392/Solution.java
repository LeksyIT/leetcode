package com.leksy.leetcode.easy.is_subsequence_392;

public class Solution {

  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc"));
  }

  public static boolean isSubsequence(String s, String t) {
    int j = 0;
    for (int i = 0; i < t.length(); i++) {
      if (t.charAt(i) == s.charAt(j)) {
        j++;
      }
    }
    return j == s.length();
  }
}
