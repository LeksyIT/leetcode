package com.leksy.leetcode.easy.path_sum_112;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    hasPathSum(
        new TreeNode(1, new TreeNode(2),null),0);
  }

  static Set<Integer> set = new HashSet<>();

  public static boolean hasPathSum(TreeNode root, int targetSum) {
    findNodeSum(root, 0);
    return set.contains(targetSum);
  }

  private static void findNodeSum(TreeNode root, int sum) {
    if (root == null) {
      return;
    }
    sum += root.val;
    set.add(sum);
    findNodeSum(root.left, sum);
    findNodeSum(root.right, sum);
  }
}
