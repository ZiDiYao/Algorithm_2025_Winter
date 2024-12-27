package Sorting;

public class InsertionSorting {

    public void inserting(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // index 0 is naturally sorted
        for (int i=1; i< arr.length;i++){
            for (int j = i-1; j>=0 && arr[j] > arr[j+1]; j--){
                swap(arr,j,j+1);
            }
        }
    }
    private void swap(int[] arr, int index01, int index02){
        int tmp = arr[index01];
        arr[index01] = arr[index02];
        arr[index02] = tmp;
    }

}
