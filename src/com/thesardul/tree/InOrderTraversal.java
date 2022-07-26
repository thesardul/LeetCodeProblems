package com.thesardul.tree;

import com.thesardul.tree.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        return res;
    }
    private void inorderTraversal(final TreeNode root1, final List<Integer> res){
        if(root1 != null){
            inorderTraversal(root1.left, res);
            res.add(root1.val);
            inorderTraversal(root1.right, res);
        }
    }
}