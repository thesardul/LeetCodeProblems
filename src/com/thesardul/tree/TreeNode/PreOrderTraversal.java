package com.thesardul.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        inOrderTraversal(root, res);
        return res;
    }
    private void inOrderTraversal(final TreeNode root1, final List<Integer> res){
        if(root1 != null){
            res.add(root1.val);
            inOrderTraversal(root1.left, res);
            inOrderTraversal(root1.right, res);
        }
    }
}
