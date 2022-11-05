package com.leksy.leetcode.easy.reverse_vowels_of_a_string_345;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    System.out.println(reverseVowels("leetcode"));
  }

  private static boolean[] alphabet = new boolean[123];

  static {
    alphabet[65] = true;
    alphabet[69] = true;
    alphabet[73] = true;
    alphabet[79] = true;
    alphabet[85] = true;
    alphabet[97] = true;
    alphabet[101] = true;
    alphabet[105] = true;
    alphabet[111] = true;
    alphabet[117] = true;
  }

  public static String reverseVowels(String s) {
    List<Integer> vowels = new ArrayList<>();
    char[] charArr = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      if (alphabet[charArr[i]]){
        vowels.add(i);
      }
    }
    for (int i = 0; i < vowels.size()/2; i++) {
      char swap = charArr[vowels.get(i)];
      charArr[vowels.get(i)] = charArr[vowels.get(vowels.size() - i -1 )];
      charArr[vowels.get(vowels.size() - i -1 )] = swap;
    }
    return String.valueOf(charArr);
  }

}
