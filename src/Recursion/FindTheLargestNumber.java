package Recursion;

public class FindTheLargestNumber {
    // Get the largest number within the range [L..R]
    public int getTheLargestNumber(int[] arr, int L, int R){
        // base case
        if (L == R){
            return arr[L];
        }
        int mid = L + (R-L)/2;
        int leftMax = getTheLargestNumber(arr,L,mid);
        int rightMax = getTheLargestNumber(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }
}
