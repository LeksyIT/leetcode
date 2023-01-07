package com.leksy.leetcode.easy.length_of_last_word_58;

public class Solution {

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("Hello World"));
  }

  public static int lengthOfLastWord(String s) {
    int counter =0;
    s = s.trim();
    int i = s.length()-1;
    while (i != 0 && s.codePointAt(i) != 32){
      i--;
      counter++;
    }
    return counter;
  }
}
