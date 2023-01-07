package com.leksy.leetcode.easy.plus_one_66;

class Solution {

  public static void main(String[] args) {
    System.out.println(plusOne(new int[]{9, 9}));
  }

  public static int[] plusOne(int[] digits) {
    int len = digits.length;
    for (int i = len - 1; i > 0; i--) {
      if (digits[i] < 9) {
        digits[i] += 1;
        return digits;
      }
    }
    int[] newArr = new int[len+1];
    System.arraycopy(digits,0,newArr,1,len);
    newArr[0] = 1;
    return newArr;
  }
}
