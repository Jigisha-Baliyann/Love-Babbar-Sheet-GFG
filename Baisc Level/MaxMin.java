class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            min = Math.min( A[i], min);
            max = Math.max( A[i], max);
        }
        return (min+max);
    }
}
