package com.leksy.leetcode.medium.online_stock_span_901;

import java.util.Stack;

public class StockSpanner {

  private final Stack<int[]> priceList;

  public StockSpanner() {
    priceList = new Stack<>();
  }

  public int next(int price) {
    int count = 0;
    while (!priceList.empty() && price >= priceList.peek()[0]) {
      count += priceList.peek()[1];
      priceList.pop();
    }
    priceList.push(new int[]{price, count});
    return count;
  }
}

