package problems;

public class MaximumDepthOfBinaryTree {
    /*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
     */
    public int maxDepth(TreeNode root) {

        Integer depth=0;
        return calculateMaxDepth(root,depth);

    }

    private Integer calculateMaxDepth(TreeNode root,Integer depth) {
        //if we reached the end of current branch
        if(root==null)return depth;
        //else we have more depth
        depth++;
        //checking the left depth and right depth recursively
        Integer leftDepth=calculateMaxDepth(root.left,depth);
        Integer rightDepth=calculateMaxDepth(root.right,depth);
        //returning the maximum
        return leftDepth>rightDepth?leftDepth:rightDepth;
    }



}
