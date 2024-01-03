class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }
    void dfs(ArrayList<Integer> result, Node node) {
        if (node != null) {
            if (node.left != null) dfs(result, node.left);
            result.add(node.data);
            if (node.right != null) dfs(result, node.right);
        }
    }
}
