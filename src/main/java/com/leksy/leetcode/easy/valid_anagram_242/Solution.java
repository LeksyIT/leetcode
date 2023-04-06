package com.leksy.leetcode.easy.valid_anagram_242;

public class Solution {

  public static void main(String[] args) {
    isAnagram("rat", "cat");
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i) - 97]++;
    }
    for (int i = 0; i < s.length(); i++) {
      if (--arr[s.charAt(i) - 97] == -1) {
        return false;
      }
    }
    return true;
  }
}