package com.leksy.leetcode.medium.boats_to_save_people_881;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    numRescueBoats(new int[]{3,2,3,2,2}, 6);
  }

  public static int numRescueBoats(int[] people, int limit) {
    List<Integer> resultArr = new ArrayList<>();
    Arrays.sort(people);
    resultArr.add(people[people.length - 1]);
    int counter = 0;
    for (int i = people.length - 2; i >= 0; i--) {
      for (int j = 0; j < resultArr.size() + 1; j++) {
        if (resultArr.isEmpty()){
          resultArr.add(people[i]);
          break;
        }
        if (j == resultArr.size()){
          resultArr.add(people[i]);
          break;
        }
        if (limit - (resultArr.get(j) + people[i]) >= 0){
          counter++;
          resultArr.remove(j);
          break;
        }
      }
    }
    return counter + resultArr.size();
  }
}
