package com.leksy.leetcode.easy.fizz_buzz_412;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
  public List<String> fizzBuzz(int n) {
    List<String> arr = new ArrayList<>(n);
    for (int i = 1,fizz=0,buzz=0; i < n+1; i++) {
      fizz++;
      buzz++;
      if (i != fizz  && i != buzz){
        arr.add(String.valueOf(i));
      } else if (i == fizz  && i == buzz){
        arr.add("FizzBuzz");
        fizz = 0;
        buzz = 0;
      }else if(i == fizz){
        arr.add("Fizz");
        fizz = 0;
      }else if(i == buzz){
        arr.add("Buzz");
        buzz = 0;
      }
    }
    return arr;
  }
}
