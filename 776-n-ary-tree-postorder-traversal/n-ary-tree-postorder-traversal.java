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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> post = new ArrayList<>();
        helper(root, post);
        return post;
        
    }
    private void helper(Node c_root, List<Integer> post){
        if(c_root == null){
            return;
        }
        for (Node x : c_root.children) {
    helper(x,post);
}

        
        post.add(c_root.val);
    }
}