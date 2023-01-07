package com.leksy.leetcode.medium.maximum_bags_with_full_capacity_of_rocks_2279;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    maximumBags(new int[]{10,2,2},new int[]{2,2,0},100);
  }

  public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
    int[] needRocks = new int[capacity.length];

    for (int i = 0; i < needRocks.length; i++) {
      needRocks[i] = capacity[i] - rocks[i];
    }
    Arrays.sort(needRocks);
    int count = 0;
    while (count < needRocks.length && additionalRocks - needRocks[count] >= 0) {
      additionalRocks -= needRocks[count];
      count++;
    }
    return count;
  }
}
