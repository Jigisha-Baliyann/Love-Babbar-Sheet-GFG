// https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty=School&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n = v.length;
        if (n%2!=0) {
            int mid = n/2;
            return v[mid];
        }
        else {
            int mdn = v[n/2] + v[(n/2)-1];
            return mdn/2;
        }
    }
}
