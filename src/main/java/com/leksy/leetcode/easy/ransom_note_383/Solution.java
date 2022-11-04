package com.leksy.leetcode.easy.ransom_note_383;

public class Solution {

  public static void main(String[] args) {
    System.out.println(canConstruct("aab", "baa"));
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    int[] arr = new int[26];
    for (char i : magazine.toCharArray()) {
      arr[i - 'a']++;
    }
    for (char i : ransomNote.toCharArray()) {
      if (arr[i - 'a'] == 0) {
        return false;
      } else {
        arr[i - 'a']--;
      }
    }
    return true;
  }
}
