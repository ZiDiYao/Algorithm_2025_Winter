package Sorting;

public class Merge {
    // 归并排序 Recursion
    // O(NlogN) O(N)
    public void mergeSort(int[] arr, int L, int R){
        // base case
        if (L == R){
            return;
        }
        int mid = L + (R-L)/2;
        mergeSort(arr,L,mid);
        mergeSort(arr,mid+1,R);
        mergeProcess(arr,L,mid,R);
    }
    private void mergeProcess(int[] arr, int L, int M, int R){
        int[] tmp = new int[R-L+1];
        int tmpPointer = 0;
        int pointer01 = L;
        int pointer02 = M+1;
        while (pointer01 <= M && pointer02 <=R){
            if (arr[pointer01] <= arr[pointer02]){
                tmp[tmpPointer] = arr[pointer01];
                tmpPointer++;
                pointer01++;
            }
            else{
                tmp[tmpPointer] = arr[pointer02];
                tmpPointer++;
                pointer02++;
            }
        }
        // handle the case when pointer01 is not ended
        while(pointer01 <= M){
            tmp[tmpPointer] = arr[pointer01];
            tmpPointer++;
            pointer01++;
        }
        // // handle the case when pointer02 is not ended
        while(pointer02 <=R){
            tmp[tmpPointer] = arr[pointer02];
            tmpPointer++;
            pointer02++;
        }
        for (int i=0; i< tmp.length; i++){
            arr[L+i] = tmp[i];
        }
    }
}
