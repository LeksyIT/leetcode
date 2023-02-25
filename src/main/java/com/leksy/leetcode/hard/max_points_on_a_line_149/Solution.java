package com.leksy.leetcode.hard.max_points_on_a_line_149;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {

  public int maxPoints(int[][] points) {
    if (points.length == 1) {
      return 1;
    }
    int topByPoint = 0;
    for (int[] origin : points) {
      Map<Double, Integer> freq = new HashMap<>();
      for (int[] point : points) {
        if (Arrays.equals(origin, point)) {
          continue;
        }
        double angle = Math.atan2(point[1] - origin[1], point[0] - origin[0]);
        freq.merge(angle, 1, Integer::sum);
      }
      topByPoint = Math.max(topByPoint, Collections.max(freq.values()) + 1);
    }
    return topByPoint;
  }
}
