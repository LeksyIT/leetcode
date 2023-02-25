package com.leksy.leetcode.easy.greatest_common_divisor_of_strings_1071;

public class Solution {

  public static void main(String[] args) {
    gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
  }

  public static String gcdOfStrings(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }
    int b = str1.length();
    int a = str2.length();
    while (b != 0) {
      int el = b;
      b = a % b;
      a = el;

    }
    return str2.substring(0, a);
  }
}
