package com.leksy.leetcode.medium.longest_substring_without_repeating_characters_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("pwwkew"));
  }

  public static int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> wordsMap = new LinkedHashMap<>();
    char[] wordArr = s.toCharArray();
    int counter = 0;
    int left = 0;
    int right = 0;
    while (right < wordArr.length) {
      wordsMap.merge(wordArr[right], 1, Integer::sum);
      while (wordsMap.get(wordArr[right]) > 1) {
        wordsMap.merge(wordArr[left], 1, (x1,x2)->x1-x2);
        left++;
      }
      right++;
      counter = Math.max(counter, right - left);
    }
    return Math.max(counter, right - left);
  }
}
