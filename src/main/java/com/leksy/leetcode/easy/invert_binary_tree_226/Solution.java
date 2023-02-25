package com.leksy.leetcode.easy.invert_binary_tree_226;

class Solution {

  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      root.right = invertTree(root.left);
      root.left = invertTree(root.right);
    }
    return root;
  }
}
