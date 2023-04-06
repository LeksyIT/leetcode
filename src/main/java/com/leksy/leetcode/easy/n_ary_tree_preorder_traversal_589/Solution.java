package com.leksy.leetcode.easy.n_ary_tree_preorder_traversal_589;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> preorder(Node root) {
    return addToList(root, new ArrayList<>());
  }

  private List<Integer> addToList(Node root, List<Integer> list) {
    if (root != null) {
      list.add(root.val);
      for (Node node : root.children) {
        addToList(node, list);
      }
    }
    return list;
  }
}
