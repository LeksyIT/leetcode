package com.leksy.leetcode.easy.average_salary_excluding_the_minimum_and_maximum_salary_1491;

class Solution {

  public static void main(String[] args) {
    System.out.println(average(
        new int[]{48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000,
            77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000}));
  }

  public static double average(int[] salaries) {
    int min = salaries[0];
    int max = 0;
    double sum = 0;
    for (int salary : salaries) {
      sum += salary;
      max = Math.max(max, salary);
      min = Math.min(min, salary);
    }
    return (sum - (max + min)) / (salaries.length - 2);
  }
}