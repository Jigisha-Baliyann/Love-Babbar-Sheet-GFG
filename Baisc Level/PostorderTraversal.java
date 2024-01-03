class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }
    void dfs(ArrayList<Integer> result, Node node) {
        if (node != null) {
            if (node.left != null) dfs(result, node.left);
            if (node.right != null) dfs(result, node.right);
            result.add(node.data);
        }
    }
}
