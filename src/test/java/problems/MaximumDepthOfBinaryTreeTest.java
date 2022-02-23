package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void testMaxDepth() {
        //given
        MaximumDepthOfBinaryTree testClass = new MaximumDepthOfBinaryTree();
        TreeNode left_left_left=new TreeNode(18);
        TreeNode left_right=new TreeNode(20);
        TreeNode left_left=new TreeNode(19,left_left_left,null);
        TreeNode right_left=new TreeNode(17);
        TreeNode left=new TreeNode(22,left_left,left_right);
        TreeNode right=new TreeNode(21,right_left,null);
        TreeNode root=new TreeNode(23,left,right);

        assertEquals(4, testClass.maxDepth(root));
    }
}

