package com.leksy.leetcode.easy.longest_common_prefix_14;

class Solution {

  public static String longestCommonPrefix(String[] strs) {
    String target = strs[0];
    for (int i = 0; i < strs.length; i++) {
      if (target.length() == 0) {
        return target;
      }
      while (strs[i].indexOf(target) != 0) {
        target = target.substring(0, target.length() - 1);
      }
    }
    return target;
  }
}
