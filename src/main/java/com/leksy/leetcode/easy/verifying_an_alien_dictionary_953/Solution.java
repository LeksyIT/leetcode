package com.leksy.leetcode.easy.verifying_an_alien_dictionary_953;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public boolean isAlienSorted(String[] word, String alphabet) {
    Map<Character, Integer> order = new HashMap<>();
    for (int i = 0; i < alphabet.length(); i++) {
      order.put(alphabet.charAt(i), i);
    }
    for (int i = 1; i < word.length; i++) {
      String a = word[i - 1];
      String b = word[i];
      for (int j = 0; j < a.length(); j++) {
        if (j == b.length()) {
          return false;
        }
        char cha = a.charAt(j);
        char chb = b.charAt(j);
        if (order.get(cha) < order.get(chb)) {
          break;
        }
        if (order.get(cha) > order.get(chb)) {
          return false;
        }
      }
    }
    return true;
  }
}
