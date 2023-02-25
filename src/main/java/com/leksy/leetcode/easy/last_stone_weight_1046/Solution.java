package com.leksy.leetcode.easy.last_stone_weight_1046;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

  public static void main(String[] args) {
    System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
  }

  public static int lastStoneWeight(int[] stones) {
    Queue<Integer> queue = new PriorityQueue<>((x1, x2) -> x2 - x1);
    for (int i : stones) {
      queue.add(i);
    }
    while (!queue.isEmpty() && queue.size() != 1) {
      queue.add(queue.poll() - queue.poll());
    }
    return queue.isEmpty() ? stones[0] : queue.peek();
  }
}
