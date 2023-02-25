package com.leksy.leetcode.easy.add_binary_67;

public class Solution {

  public static void main(String[] args) {
    System.out.println(addBinary("1010", "1011"));
  }

  public static String addBinary(String a, String b) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int indx = 0;
    while (i >= 0 || j >= 0) {
      if (i >= 0 && a.charAt(i) == '1') {
        indx++;
      }
      if (j >= 0 && b.charAt(i) == '1') {
        indx++;
      }
      stringBuilder.append(indx % 2);
      indx /= 2;
      i--;
      j--;
    }
    if (indx == 1) {
      stringBuilder.append("1");
    }
    return stringBuilder.reverse().toString();
  }
}
