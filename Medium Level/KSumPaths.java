class Solution
{
    int num = 1000000007;
    int answer;
    HashMap<Integer,Integer> mp;
    public int sumK(Node root,int k)
    {
        // code here 
        mp = new HashMap<>();
        answer=0;
        dfs(root,k,0);
        return answer;
    }
    public void dfs(Node root, int k, int curr) 
    {
        if (root == null) return;
        if ((curr + root.data)==k) answer = (answer+1)%num;
        answer = (answer + (mp.getOrDefault(curr + root.data - k, 0))%num)%num;
        mp.put(curr + root.data, (mp.getOrDefault(curr + root.data, 0)+1)%num);
        dfs(root.left, k, curr+root.data);
        dfs(root.right, k, curr+root.data);
        mp.put(curr + root.data, ((mp.getOrDefault(curr + root.data, 0)-1)+num)%num);
    }
}
