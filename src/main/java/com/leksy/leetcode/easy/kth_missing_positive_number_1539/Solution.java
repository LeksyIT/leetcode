package com.leksy.leetcode.easy.kth_missing_positive_number_1539;

public class Solution {

  public static void main(String[] args) {
    findKthPositive(new int[]{2,3,10,12,13},5);
  }

  public static int findKthPositive(int[] arr, int k) {
    int left = 0, right = arr.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] - mid > k) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return right + k;
  }
}
