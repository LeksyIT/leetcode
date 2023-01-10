package com.leksy.leetcode.medium.gas_station_134;

class Solution {

  public static void main(String[] args) {
    canCompleteCircuit(new int[]{2,3,4,5}, new int[]{4,5,1,2});
  }

  public static int canCompleteCircuit(int[] gas, int[] cost) {
    int gasCount = 0;
    int costCount = 0;
    int[] profitArr = new int[gas.length];
    for (int i = 0; i < gas.length; i++) {
      profitArr[i] = gas[i] - cost[i];
      gasCount += gas[i];
      costCount += cost[i];
    }
    if (gasCount < costCount) {
      return -1;
    }
    int start = 0;
    int availableGas = 0;
    for (int i = 0; i < profitArr.length; i++) {
      availableGas += profitArr[i];
      if (availableGas < 0) {
        start = i+1;
        availableGas =0;
      }
    }
    return availableGas > 0 ? start : -1;
  }
}
