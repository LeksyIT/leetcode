package com.leksy.leetcode.easy.binary_tree_inorder_traversal_94;

import java.util.ArrayList;
import java.util.List;

class Solution {

  List<Integer> result = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null){
      return result;
    }
    inorderTraversal(root.left);
    result.add(root.val);
    inorderTraversal(root.right);
    return result;
  }
}
