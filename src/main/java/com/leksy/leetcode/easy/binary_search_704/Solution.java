package com.leksy.leetcode.easy.binary_search_704;

class Solution {

  public static void main(String[] args) {
    System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
  }

  public static int search(int[] nums, int target) {
    if (nums.length == 1) {
      if (nums[0] == target) {
        return 0;
      } else {
        return -1;
      }
    }
    int length = nums.length/2;
    int aim = (int) (Math.log(nums.length) / Math.log(2));
    for (int i = 0; i < aim; i++) {
      if (nums[length] == target) {
        return length;
      }
      if (length > target) {
        length = length - length/2;
      } else {
        length = length + length/2;
      }
    }
    return -1;
  }
}
