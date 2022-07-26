package com.thesardul.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public List<Integer> postOrderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        postOrderTraversal(root, res);
        return res;
    }
    private void postOrderTraversal(final TreeNode root1, final List<Integer> res){
        if(root1 != null){
            postOrderTraversal(root1.left, res);
            postOrderTraversal(root1.right, res);
            res.add(root1.val);
        }
    }
}
