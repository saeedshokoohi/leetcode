package problems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumWidthOfBinaryTreeTest {
    @Test
    public void testWidthOfBinaryTree() {
        MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();
        assertEquals(1, maximumWidthOfBinaryTree.widthOfBinaryTree(getSample4()));
        assertEquals(1, maximumWidthOfBinaryTree.widthOfBinaryTree(getSample3()));
        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(getSample2()));
        assertEquals(4, maximumWidthOfBinaryTree.widthOfBinaryTree(getSample1()));
    }

    @Test
    public void maxDepthTest() {
        //given
        MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();
        TreeNode root1 = getSample1();

        assertEquals(4, maximumWidthOfBinaryTree.calculateMaxDepth(root1, 0));
    }

    @Test
    public void putTreeInArrayTest() {
        MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();
        TreeNode root1 = getSample5();


        Integer maxDepth1 = maximumWidthOfBinaryTree.calculateMaxDepth(root1, 0);

        HashMap<Integer,Integer> array1=new HashMap<>();
        maximumWidthOfBinaryTree.putTreeInArray(root1, 1,maxDepth1, array1, 0);
//        assertArrayEquals(array1, new Integer[]{1, 3, 2, 5, 3, null, 9});
    }
    @Test
    public void lengthTest()
    {
        MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();
        assertEquals(3,maximumWidthOfBinaryTree.length(2));
        assertEquals(1,maximumWidthOfBinaryTree.length(1));
        assertEquals(7,maximumWidthOfBinaryTree.length(3));
    }

    //[1,3,2,5,3,null,9]
    private TreeNode getSample1() {
        TreeNode left_left = new TreeNode(5);
        TreeNode left_right=new TreeNode(3);
        TreeNode left = new TreeNode(3, left_left, left_right);
        TreeNode right_right = new TreeNode(9);
        TreeNode right = new TreeNode(2, null, right_right);
        TreeNode root = new TreeNode(1, left, right);
        return root;
    }

    private TreeNode getSample2() {
        TreeNode left_left_right = new TreeNode(3);
        TreeNode left_left = new TreeNode(5);
        TreeNode left = new TreeNode(3, left_left, left_left_right);
        TreeNode root = new TreeNode(1, left, null);
        return root;
    }
    private TreeNode getSample3() {

        TreeNode left = new TreeNode(2);
        TreeNode root = new TreeNode(1, left, null);
        return root;
    }
    private TreeNode getSample4() {

        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, right);
        return root;
    }
    private TreeNode getSample5() {

        TreeNode right_right_right=new TreeNode(4);
        TreeNode right_right=new TreeNode(3,null,right_right_right);
        TreeNode right = new TreeNode(2,null,right_right);
        TreeNode root = new TreeNode(1, null, right);
        return root;
    }


}

