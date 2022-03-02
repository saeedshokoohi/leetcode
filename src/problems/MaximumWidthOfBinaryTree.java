package problems;

import java.util.*;

public class MaximumWidthOfBinaryTree {

    /*
    Given the root of a binary tree, return the maximum width of the given tree.

The maximum width of a tree is the maximum width among all levels.

The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.

It is guaranteed that the answer will in the range of 32-bit signed integer.



Example 1:


Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
Example 2:


Input: root = [1,3,null,5,3]
Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
Example 3:


Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).


Constraints:

The number of nodes in the tree is in the range [1, 3000].
-100 <= Node.val <= 100
     */

    public int widthOfBinaryTree(TreeNode root) {


        Integer maxDepth=0;
        maxDepth= calculateMaxDepth(root,maxDepth);

        HashMap<Integer,Integer> treeNodeArray=new HashMap<>();
        putTreeInArray(root,1,maxDepth,treeNodeArray,0);


        Integer maxWidth=0;
        for(int i=1;i<=maxDepth;i++)
        {
            int from=length(i-1);
            int to=from+Double.valueOf(Math.pow(2,i-1)).intValue()-1;

            while ( from<to && treeNodeArray.get(from)==null  )from++;
            while (to>from && treeNodeArray.get(to)==null    )to--;

            maxWidth=Math.max(maxWidth,to-from+1);

        }

       return maxWidth;


    }
    public int length(int depth)
    {
        Double length=0d;
        for(int i=0;i<depth;i++)
        {
            length+=Math.pow(2,i);
        }
        return length.intValue();
    }

    public void putTreeInArray(TreeNode root,int startIndex, Integer maxDepth,  HashMap<Integer,Integer> treeNodeArray,Integer depth) {
        if(depth<=maxDepth) {
            if(root!=null)
            {
                treeNodeArray.put(startIndex-1,root.val);
                putTreeInArray(root.left,startIndex*2, maxDepth, treeNodeArray, depth + 1);
                putTreeInArray(root.right,startIndex*2+1, maxDepth, treeNodeArray, depth + 1);
            }
        }

    }

    public int calculateMaxDepth(TreeNode root, Integer depth) {
        if(root==null)return depth;
        return Math.max(calculateMaxDepth(root.left, depth+1), calculateMaxDepth(root.right, depth+1));


    }


}
