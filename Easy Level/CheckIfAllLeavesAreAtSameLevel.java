class Solution
{
    boolean check(Node root)
    {
	    // Your code here
	    if (root == null) return true;
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    int level = 0;
	    boolean firstLeaf = true;
	    int leafLevel = 0;
	    while (!q.isEmpty()) {
	        int size = q.size();
	        for (int i=0; i<size; i++) {
	            Node curr = q.poll();
	            if (curr.left == null && curr.right == null) {
	                if (firstLeaf) {
	                    leafLevel = level;
	                    firstLeaf = false;
	                }
	                else if (level != leafLevel) return false;
	            }
	            if (curr.left != null) q.add(curr.left);
	            if (curr.right != null) q.add(curr.right);
	        }
	        level++;
	    }
	    return true;
    }
}
