package com.leksy.leetcode.easy.best_time_to_buy_and_sell_stock_121;

public class Solution {

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {
    int buy = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      }
      int profit = prices[i] - buy;
      if (maxProfit < profit) {
        maxProfit = profit;
      }
    }
    return maxProfit;
  }

//  public static int maxProfit(int[] prices) {
//    int buy = 0;
//    int sell = 1;
//    int maxProfit = 0;
//    while (sell<prices.length){
//      int currentProfit = prices[sell] - prices[buy];
//      if (prices[sell] > prices[buy]){
//        if (maxProfit<currentProfit){
//          maxProfit=currentProfit;
//        }
//      } else {
//        buy = sell;
//      }
//
//      sell+=1;
//    }
//    return maxProfit;
//  }
}
