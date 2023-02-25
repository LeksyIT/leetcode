package com.leksy.leetcode.easy.add_to_array_form_of_integer_989;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    System.out.println(addToArrayForm(new int[]{2, 1, 5}, 806));
  }

  public static List<Integer> addToArrayForm(int[] num, int k) {
    LinkedList<Integer> result = new LinkedList<>();
    int i = num.length - 1;
    while (k > 0 || i >= 0) {
      if (i >= 0) {
        k += num[i--];
      }
      result.addFirst(k % 10);
      k /= 10;
    }
    return result;
  }
}
