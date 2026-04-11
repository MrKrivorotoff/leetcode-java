package org.mrkrivorotoff.invert_binary_tree;

import org.mrkrivorotoff.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invertNodeIfPresented(root);
    }

    private static TreeNode invertNodeIfPresented(TreeNode node) {
        if (node == null)
            return null;
        var leftNode = node.left;
        node.left = invertNodeIfPresented(node.right);
        node.right = invertNodeIfPresented(leftNode);
        return node;
    }

    private static TreeNode createInvertedNodeIfPresented(TreeNode node) {
        if (node == null)
            return null;
        var leftNode = createInvertedNodeIfPresented(node.right);
        var rightNode = createInvertedNodeIfPresented(node.left);
        return new TreeNode(node.val, leftNode, rightNode);
    }
}