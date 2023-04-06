package com.leksy.leetcode.easy.move_zeroes_283;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {

//  public void moveZeroes(int[] nums) {
//    int[] newArr = new int[nums.length];
//    int counter = 0;
//    for (int i : nums) {
//      if (i != 0) {
//        newArr[counter] = i;
//        counter += 1;
//      }
//    }
//    System.arraycopy(newArr, 0, nums, 0, nums.length);
//  }

  public void moveZeroes(int[] nums) {
    for (int i = 0,j = 0; i < nums.length; i++) {
      if (nums[i] != 0){
        nums[j++] = nums[i];
      }
    }
  }
}
