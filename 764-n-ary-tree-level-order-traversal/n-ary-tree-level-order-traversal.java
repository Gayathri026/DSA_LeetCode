/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root == null){
            return level;
        }
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int len = que.size();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i =0;i<len;i++){
                ans.add(que.peek().val);
                for(Node node:que.peek().children){
                    que.offer(node);
                }
                que.poll();
            }
            level.add(ans);
        }
    return level;
    }
}