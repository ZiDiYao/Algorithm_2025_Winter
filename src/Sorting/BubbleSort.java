package Sorting;

public class BubbleSort {

    public void bubbleMethod(int[] arr){
        if (arr== null || arr.length <2){
            return;
        }
        for (int i = arr.length -1; i >0; i--){
            for (int j = 0; j<i; j++ ){
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }

            }
        }

    }
    private void swap(int[] arr, int index01, int index02){
        int tmp = arr[index01];
        arr[index01] = arr[index02];
        arr[index02] = tmp;
    }
    private void swap02(int[] arr, int index01, int index02){
        arr[index01]= arr[index01]^ arr[index02];
        arr[index02]= arr[index01] ^ arr[index02];
        arr[index01]= arr[index01]^ arr[index02];

    }

}
