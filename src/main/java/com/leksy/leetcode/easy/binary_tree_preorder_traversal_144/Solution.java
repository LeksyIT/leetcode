package com.leksy.leetcode.easy.binary_tree_preorder_traversal_144;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {

  public static void main(String[] args) {
    preorderTraversal(new TreeNode(1,
        new TreeNode(2, new TreeNode(11, null, null),
            new TreeNode(15, null, null)),
        new TreeNode(10, null, null)));
  }

  public static List<Integer> preorderTraversal(TreeNode root) {

    if (root == null){
      return new LinkedList<>();
    }

    Deque<TreeNode> list = new LinkedList<>();
    List<Integer> result = new LinkedList<>();
    list.add(root);
    while (!list.isEmpty()) {
      TreeNode treeNode = list.pollFirst();
      if (treeNode.right!=null){
        list.addFirst(treeNode.right);
      }
      if (treeNode.left!=null){
        list.addFirst(treeNode.left);
      }

      result.add(treeNode.val);
    }
    return result;
  }
}
