package com.leksy.leetcode.medium.minimum_time_to_collect_all_apples_in_a_tree_1443;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    minTime(4, new int[][]{{0, 2}, {0, 3}, {1, 2}}, List.of(false, true, false, false));
  }

  public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {

    if (!hasApple.contains(true)) {
      return 0;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      if (hasApple.get(i)) {
        set.add(i);
      }
    }
    for (int i = n - 2; i >= 0; i--) {
      if (set.contains(edges[i][1])) {
        set.add(edges[i][0]);
      }
    }
    return (set.size() - 1) * 2;
  }
}
