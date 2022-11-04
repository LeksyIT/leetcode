package com.leksy.leetcode.easy.roman_to_integer_13;

import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    System.out.println(romanToInt("III"));
  }

  public static int romanToInt(String s) {
    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50,
        'C', 100, 'D', 500, 'M', 1000);
    char[] arr = s.toCharArray();
    int sum = 0;
    int discharge = 0;
    for (int i = 0; i < arr.length; i++) {
      discharge += map.get(arr[i]);
      if (i == arr.length-1 || map.get(arr[i]) > map.get(arr[i + 1])) {
        sum += discharge;
        discharge = 0;
      } else if (map.get(arr[i]) < map.get(arr[i + 1])) {
        sum -= discharge;
        discharge = 0;
      }
    }
    return sum;
  }
}
