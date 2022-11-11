package com.leksy.leetcode.easy.make_the_string_great_1544;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

class Solution {

  public static void main(String[] args) {
    System.out.println(makeGood("leEeetcode"));
  }

  public static String makeGood(String s) {
    Deque<Character> ss = new LinkedList<>();

    for (Character c : s.toCharArray()) {
      if (!ss.isEmpty() && (ss.peekLast() ^ c) == 32) {
        ss.removeLast();
      } else {
        ss.addLast(c);
      }
    }

    return ss.stream()
        .map(Object::toString)
        .collect(Collectors.joining());
  }
}
