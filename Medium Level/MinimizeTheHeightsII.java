class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int min = arr[0] + k;
        int max = arr[n-1] - k;
        int currMax, currMin;
        for (int i=0; i< n-1; i++) {
            currMin = Math.min(arr[i+1]-k, min);
            currMax = Math.max(arr[i]+k, max);
            if (currMin >= 0) ans = Math.min(ans, currMax - currMin);
        }
        return ans;
    }
}
