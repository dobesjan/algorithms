package org.example.leetcode;

import org.example.leetcode.utility.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        ans.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
