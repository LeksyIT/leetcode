package com.leksy.leetcode.easy.maximum_depth_of_binary_tree_104;

public class Solution {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
  }
}
