package com.leksy.leetcode;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int size = sc.nextInt();

    int middle = size / 2 + size % 2;
    int current = middle;
    while (count != 0) {
      System.out.println(current);
      count--;
      int step = middle - current;
      if (current == size) {
        current = middle;
      } else if (step > 0) {
        current = middle + step;
      } else if (step < 0) {
        current = middle + step - 1;
      } else {
        current = middle - 1;
      }
    }
  }
}




