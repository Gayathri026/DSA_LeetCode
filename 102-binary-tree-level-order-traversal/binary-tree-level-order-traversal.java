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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root == null){
            return level;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i =0;i<len;i++){
                TreeNode curr = que.poll();
                ans.add(curr.val);
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                 if(curr.right!=null){
                    que.offer(curr.right);
                }

              
                
            }
            level.add(ans);
        }
    return level;
        
    }
}