package com.leksy.leetcode;

public class Main {

  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 2, 2, 1};

    for (int i:returnCountArr(arr)) {
      System.out.println(i);
    }
  }

  public static int[] returnCountArr(int[] arr) {
    int[] unicArr = new int[arr.length];
    int length = 0;
    a:for (int k : arr) {
      for (int j = 0; j < length; j++) {
        if (unicArr[j] == k) {
          continue a;
        }
      }
      unicArr[length++] = k;
    }
    int[] result = new int[length];
    System.arraycopy(unicArr, 0, result, 0, length);
    return result;
  }
}




