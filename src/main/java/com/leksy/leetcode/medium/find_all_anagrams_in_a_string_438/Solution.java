package com.leksy.leetcode.medium.find_all_anagrams_in_a_string_438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < p.length(); i++) {
      map.merge(p.charAt(i), -1, Integer::sum);
    }
    for (int r = 0, l = 0; r < s.length(); r++) {
      if (map.merge(s.charAt(r), 1, Integer::sum) > 0) {
        while (map.merge(s.charAt(l++), -1, Integer::sum) != 0) {
        }
      } else if ((r - l + 1 == p.length())) {
        result.add(l);
        map.merge(s.charAt(l++), -1, Integer::sum);
      }
    }
    return result;
  }
}
