class Solution{
    int middle(int A, int B, int C){
        //code here
        int ans = A>B ? (A>C ? (B>C ? B : C) : (A>B ? A : B)) : (B>C ? (A>C ? A : C) : (A>B ? A : B));
        return ans;
    }
}
