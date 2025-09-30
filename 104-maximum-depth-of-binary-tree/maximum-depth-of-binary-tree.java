import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // Handle the edge case where the tree is empty
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> elementQ = new LinkedList<>();
        elementQ.add(root);
        int noOfLevel = 0;

        while(true){
            int nodecount = elementQ.size();
            if(nodecount == 0){
                return noOfLevel;
            }

            // Process all nodes at the current level
            while(nodecount > 0 ){
                TreeNode element = elementQ.poll();
                if(element.left!=null){
                    elementQ.add(element.left);
                }
                if(element.right!=null){
                    elementQ.add(element.right);
                }
                nodecount--;
            }
            noOfLevel++; // Increment the level count after processing a full level
        }
    }
}