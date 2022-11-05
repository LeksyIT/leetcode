package com.leksy.leetcode.hard.median_of_two_sorted_arrays_4;

public class Solution {

  public static void main(String[] args) {
    System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
  }

//  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//    List<Integer> list = new LinkedList<>();
//    int i = 0;
//    int j = 0;
//    while (nums1.length != i && nums2.length != j) {
//      if (nums1[i] > nums2[j]) {
//        list.add(nums2[j]);
//        j++;
//      } else {
//        list.add(nums1[i]);
//        i++;
//      }
//    }
//    if ((nums1.length-i) != 0){
//      for (int k = i; k < nums1.length; k++) {
//        list.add(nums1[k]);
//      }
//    }
//    if ((nums2.length-j) != 0){
//      for (int x = j; x < nums2.length; x++) {
//        list.add(nums2[x]);
//      }
//    }
//    int half = list.size()/2;
//    if (list.size() % 2 == 0) {
//      return ((double)list.get(half) + (double)list.get(half - 1))/2;
//    } else {
//      return list.get(half);
//    }
//  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int s1 = nums1.length;
    int s2 = nums2.length;
    double[] temp = new double[s1 + s2];
    int i = 0, j = 0, k = 0;
    while (i < s1 && j < s2) {
      if (nums1[i] <= nums2[j]) {
        temp[k] = nums1[i];
        i++;
        k++;
      } else {
        temp[k] = nums2[j];
        j++;
        k++;
      }
    }
    if (i >= s1) {
      for (int t = j; t < s2; t++) {
        temp[k] = nums2[t];
        k++;
      }
    }
    if (j >= s2) {
      for (int t = i; t < s1; t++) {
        temp[k] = nums1[t];
        k++;
      }
    }
    if (temp.length % 2 != 0) {
      return temp[temp.length / 2];
    } else {
      return (temp[temp.length / 2] + temp[temp.length / 2 - 1]) / 2;
    }
  }
}
