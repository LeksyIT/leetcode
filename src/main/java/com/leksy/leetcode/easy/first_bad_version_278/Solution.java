package com.leksy.leetcode.easy.first_bad_version_278;

public class Solution extends VersionControl {

  public static void main(String[] args) {
    System.out.println(firstBadVersion(5));
  }

  public static int firstBadVersion(int n) {
    int right = 0;
    int left = n;
    while (right != left) {
      int mid = right - (right - left) / 2;
      boolean version = isBadVersion(mid);
      if (!version && isBadVersion(mid + 1)) {
        return mid + 1;
      }
      if (version) {
        left = mid;
      } else {
        right = mid + 1;
      }
    }
    return 0;
  }
}
