package com.leksy.leetcode.easy.same_tree_100;

import java.util.Deque;
import java.util.LinkedList;

class Solution {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    if (p == q) {
      return true;
    }

    Deque<TreeNode> listP = new LinkedList<>();
    Deque<TreeNode> listQ = new LinkedList<>();
    listP.add(p);
    listQ.add(q);
    while (!listP.isEmpty() && !listQ.isEmpty()) {
      TreeNode treeNodeP = listP.pollFirst();
      TreeNode treeNodeQ = listQ.pollFirst();

      if (treeNodeP == null || treeNodeQ == null || treeNodeP.val != treeNodeQ.val) {
        return false;
      }

      TreeNode rightP = treeNodeP.right;
      TreeNode rightQ = treeNodeQ.right;
      TreeNode leftP = treeNodeP.left;
      TreeNode leftQ = treeNodeQ.left;

      if (rightP != null || rightQ != null) {
        listP.addFirst(rightP);
        listQ.addFirst(rightQ);
      }
      if (leftP != null || leftQ != null) {
        listP.addFirst(leftP);
        listQ.addFirst(leftQ);
      }
    }
    return true;
  }

}
