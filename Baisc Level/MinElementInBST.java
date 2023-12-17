class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if (node==null) return -1;
        else if (node.left != null) return minValue(node.left);
        else return node.data;
    }
}
