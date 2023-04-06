package com.leksy.leetcode.easy.find_nearest_point_that_has_the_same_x_or_y_coordinate_1779;

class Solution {

  public static void main(String[] args) {
    nearestValidPoint(3, 4, new int[][]{{4, 4}});
  }

  public static int nearestValidPoint(int x, int y, int[][] points) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < points.length; i++) {
      int xPoint = points[i][0];
      int yPoint = points[i][1];
      int indexVal = Math.abs(x - xPoint) + Math.abs(y - yPoint);
      if (xPoint == x || yPoint == y) {
        if (indexVal < min) {
          min = indexVal;
          minIndex = i;
        }
      }
    }
    return minIndex;
  }
}
