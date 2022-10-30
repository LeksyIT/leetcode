package com.leksy.leetcode.easy.first_bad_version_278;

public class Solution extends VersionControl {

  public static void main(String[] args) {
    System.out.println(firstBadVersion(1));
  }

  public static int firstBadVersion(int n) {
    int start = 1;
    int end = n;
    while (start <= end) {
      int mid = start + (end-start)/2;
      if (!isBadVersion(mid)) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}
