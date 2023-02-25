package com.leksy.leetcode.medium.binary_tree_zigzag_level_order_traversal_103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

  public static void main(String[] args) {
    zigzagLevelOrder(
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
  }

  public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> resultList = new ArrayList<>();
    addToList(root, resultList, 0);
    for (int i = 0; i < resultList.size(); i++) {
      if (i % 2 == 1) {
        Collections.reverse(resultList.get(i));
      }
    }
    return resultList;
  }

  public static void addToList(TreeNode root, List<List<Integer>> resultList, Integer count) {
    if (root == null) {
      return;
    }
    if (resultList.size() <= count) {
      resultList.add(new ArrayList<>());
    }
    resultList.get(count).add(root.val);
    addToList(root.left, resultList, count + 1);
    addToList(root.right, resultList, count + 1);
  }
}
