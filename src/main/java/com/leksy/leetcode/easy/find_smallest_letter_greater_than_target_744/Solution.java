package com.leksy.leetcode.easy.find_smallest_letter_greater_than_target_744;

public class Solution {

  public static void main(String[] args) {
    System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'c'));
  }

  public static char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;
    while (right >= left) {
      int mid = left + (right - left) / 2;
      if (letters[mid] == target) {
        return letters[mid];
      }
      if (letters[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return letters[0];
  }
}
