package com.leksy.leetcode.easy.kids_with_the_greatest_number_of_candies_1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    int max = 0;
    for (int i: candies) {
      max = Math.max(max,i);
    }
    for (int i: candies) {
      result.add(i+extraCandies>=max);
    }
    return result;
  }
}
