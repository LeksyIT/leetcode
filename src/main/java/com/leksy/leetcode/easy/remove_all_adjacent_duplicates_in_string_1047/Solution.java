package com.leksy.leetcode.easy.remove_all_adjacent_duplicates_in_string_1047;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

  public static void main(String[] args) {
    System.out.println(removeDuplicates("abbaca"));
  }

  public static String removeDuplicates(String s) {

    Deque<Character> deque = new LinkedList<>();

    for (Character c : s.toCharArray()) {
      if (!deque.isEmpty() && Objects.equals(deque.peekLast(), c)) {
        deque.removeLast();
      } else {
        deque.addLast(c);
      }
    }
    return deque.stream()
        .map(Object::toString)
        .collect(Collectors.joining());
  }
}
