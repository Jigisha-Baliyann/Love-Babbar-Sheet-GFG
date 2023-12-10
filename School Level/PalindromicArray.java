// https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty=School&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        for (int i=0; i<n; i++) {
            if (!isPalindrome(a[i])) return 0;
        }
        return 1;
    }
    public static boolean isPalindrome(int n) {
        int copy = n, rev = 0;
        while (copy>0) {
            int digit = copy%10;
            rev = (rev*10) + digit;
            copy /= 10;
        }
        return (n==rev);
    }
}
