package com.leksy.leetcode.easy.reverse_words_in_a_string_III_557;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
  public String reverseWords(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    return Arrays.stream(s.split(" ")).map(str -> new StringBuilder(str).reverse().toString()).collect(
        Collectors.joining(" "));
  }



}
