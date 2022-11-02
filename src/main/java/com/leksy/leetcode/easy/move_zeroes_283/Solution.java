package com.leksy.leetcode.easy.move_zeroes_283;

import java.util.Arrays;

public class Solution {

  public void moveZeroes(int[] nums) {
    int[] newArr = new int[nums.length];
    int counter = 0;
    for (int i : nums) {
      if (i != 0) {
        newArr[counter] = i;
        counter += 1;
      }
    }
    System.arraycopy(newArr, 0, nums, 0, nums.length);
  }

//  public void moveZeroes(int[] nums) {
//    int snowBallSize = 0;
//    for (int i=0;i<nums.length;i++){
//      if (nums[i]==0){
//        snowBallSize++;
//      }
//      else if (snowBallSize > 0) {
//        int t = nums[i];
//        nums[i]=0;
//        nums[i-snowBallSize]=t;
//      }
//    }
//  }
}
