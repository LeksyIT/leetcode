package com.leksy.leetcode.easy.happy_number_202;

import java.util.HashSet;
import java.util.Set;

class Solution {

  public static void main(String[] args) {
    isHappy(19);
  }

  public static boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    while (n != 1){
      int next = 0;
      while (n != 0 ){
        next = next + (n%10) * (n%10);
        n/=10;
      }
      if (!set.add(next)){
       return false;
      }
    }
    return true;
  }
}
