class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }
    static void dfs(ArrayList<Integer> result, Node node) {
        if (node != null) {
            result.add(node.data);
            if (node.left != null) dfs(result, node.left);
            if (node.right != null) dfs(result, node.right);
        }
    }
}
