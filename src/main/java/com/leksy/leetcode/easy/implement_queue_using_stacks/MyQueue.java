package com.leksy.leetcode.easy.implement_queue_using_stacks;

import java.util.Stack;

class MyQueue {

  private static final Stack<Integer> stack = new Stack<>();

  public MyQueue() {

  }

  public void push(int x) {
    stack.push(x);
  }

  public int pop() {
    return stack.pop();
  }

  public int peek() {
    return stack.peek();
  }

  public boolean empty() {
    return stack.empty();
  }
}
