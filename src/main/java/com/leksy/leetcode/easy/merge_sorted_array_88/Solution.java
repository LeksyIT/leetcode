package com.leksy.leetcode.easy.merge_sorted_array_88;

class Solution {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int indx = nums1.length - 1;
    m--;
    n--;
    while (n >= 0) {
      if (m >= 0 && nums1[m] > nums2[n]) {
        nums1[indx--] = nums1[m--];
      } else {
        nums1[indx--] = nums2[n--];
      }
    }
  }
}