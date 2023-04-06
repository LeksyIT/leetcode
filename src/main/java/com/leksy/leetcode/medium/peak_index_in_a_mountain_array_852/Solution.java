package com.leksy.leetcode.medium.peak_index_in_a_mountain_array_852;

public class Solution {

  public static void main(String[] args) {
    peakIndexInMountainArray(new int[]{0, 1, 0});
  }

  public static int peakIndexInMountainArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] < arr[mid + 1]) {
        left = mid + 1;
      } else if (arr[mid] < arr[mid - 1]) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
