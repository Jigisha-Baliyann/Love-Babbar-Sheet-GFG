// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty=School&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=1; i<=n ;i++) {
            if (arr[i-1]==i) answer.add(i);
        }
        return answer;
    }
}
