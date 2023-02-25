package com.leksy.leetcode.easy.minimum_distance_between_bst_nodes_783;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    minDiffInBST(
        new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6)));
  }

  public static int minDiffInBST(TreeNode root) {
    List<Integer> valList = new ArrayList<>();
    valList.add(root.val);
    distanse(root.right, valList);
    distanse(root.left, valList);
    int min = Integer.MAX_VALUE;
    Collections.sort(valList);
    for (int i = 0; i < valList.size() - 1; i++) {
      min = Math.min(min, valList.get(i + 1) - valList.get(i));
    }
    return min;
  }

  private static List<Integer> distanse(TreeNode root, List<Integer> map) {
    if (root == null) {
      return map;
    } else {
      map.add(root.val);
      distanse(root.right, map);
      distanse(root.left, map);
      return map;
    }
  }
}
