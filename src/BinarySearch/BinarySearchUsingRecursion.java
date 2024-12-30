package BinarySearch;

public class BinarySearchUsingRecursion {
    // using recursion to find target numbers
    public int binarySearchRecursive(int[] arr, int target, int left, int right){
        // base case
        if (left > right){
            return -1;
        }
        int mid = left + (right - left)/2;
        if (mid < target){
            return binarySearchRecursive(arr, target, mid + 1, right);
        }else{
            return binarySearchRecursive(arr, target, left, mid-1);
        }
    }
}
