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
    public List<Integer> preorder(Node root) {
        List<Integer> pre = new ArrayList<>();
        helper(root, pre);
        return pre;
        
    }
    private void helper(Node c_root, List<Integer> pre){
        if(c_root == null){
            return;
        }
        pre.add(c_root.val);
        for (Node x : c_root.children) {
    helper(x,pre);
}
  
    }
}