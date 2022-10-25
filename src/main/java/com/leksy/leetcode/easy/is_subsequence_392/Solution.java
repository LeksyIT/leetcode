package com.leksy.leetcode.easy.is_subsequence_392;

public class Solution {

  public static void main(String[] args) {
    System.out.println(isSubsequence(
        "axc", "ahbgdc"));
  }
  public static boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;
    while(i < s.length() && j < t.length()){
      if(s.charAt(i) == t.charAt(j)) i++;
      j++;
    }
    return i == s.length();
  }
}
