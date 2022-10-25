package com.leksy.leetcode.easy.longest_common_prefix_14;

public class Solution {

  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String start = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(start) != 0){
       start = start.substring(0,start.length()-1);
       if (start.isEmpty()){
         return "";
       }
      }
    }
    return start;
  }
}
