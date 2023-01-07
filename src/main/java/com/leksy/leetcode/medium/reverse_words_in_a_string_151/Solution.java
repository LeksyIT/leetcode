package com.leksy.leetcode.medium.reverse_words_in_a_string_151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {

  public static void main(String[] args) {
    List<String> a = new ArrayList<>();
    a.add("2");
    a.add("2");
    a.add("2");
    a.add("2");
    a.add("2");
    a.add("2");
    a.add("1");
    a.add("1");
   addPradRegisterStagesCreatedToStartList(a);
  }

  private static Deque<String> addPradRegisterStagesCreatedToStartList(
      List<String> dependencyList) {
    Deque<String> dependencyListWithRightSorted = new LinkedList<>();
    for (String dependency : dependencyList) {
      if (dependency.equals("1")) {
        dependencyListWithRightSorted.addFirst(dependency);
      } else {
        dependencyListWithRightSorted.addLast(dependency);
      }
    }
    return dependencyListWithRightSorted;
  }

  public static String reverseWords(String s) {
    return Arrays.stream(s.trim().split("\\s+"))
        .reduce((x1, x2) -> x2 + " " + x1)
        .orElse("");
  }
}