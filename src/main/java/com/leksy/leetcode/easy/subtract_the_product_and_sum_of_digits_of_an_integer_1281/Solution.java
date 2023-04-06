package com.leksy.leetcode.easy.subtract_the_product_and_sum_of_digits_of_an_integer_1281;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int subtractProductAndSum(int n) {
    int sum = 0;
    int multiplication = 1;
    while (n>0){
      int num =n%10;
      sum+=num;
      multiplication*=num;
      n/=10;
    }
    return multiplication - sum;
  }
}
