package com.leksy.leetcode.easy.find_the_town_judge_997;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

  public static void main(String[] args) {
    findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}});
  }

  public static int findJudge(int n, int[][] trust) {
    if (n == 1) {
      return 1;
    }
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> trustSomeOne = new HashSet<>();
    for (int[] el : trust) {
      int trustPerson = el[1];
      map.merge(trustPerson, 1, Integer::sum);
      trustSomeOne.add(el[0]);
    }
    for (Integer key : map.keySet()) {
      if (map.get(key) == n - 1 && !trustSomeOne.contains(key)) {
        return key;
      }
    }
    return n - trust.length;
  }
}
