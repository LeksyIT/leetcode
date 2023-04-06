package com.leksy.leetcode.easy.symmetric_tree_101;

class Solution {
  public boolean isSymmetric(TreeNode root) {
    return root != null && equalsTree(root.left,root.right);
  }

  private boolean equalsTree(TreeNode left,TreeNode right){
    if (left == null && right == null){
      return true;
    }
    if(left == null || right == null || left.val != right.val){
      return false;
    }
    return equalsTree(left.left,right.right) && equalsTree(left.right,right.left);
  }
}
