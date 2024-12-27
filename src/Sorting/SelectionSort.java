package Sorting;

public class SelectionSort {
    public void selectMethod01(int[] arr){
        if (arr == null|| arr.length <2){
            return;
        }
        for (int i =0; i< arr.length-1; i++){
            for (int j = i; j <arr.length;j++){
                if (arr[j]<arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public void selectMethod02(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 假设当前索引是最小值索引
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 更新最小值索引
                }
            }
            if (minIndex != i) { // 如果找到更小的值，则交换
                swap(arr, i, minIndex);
            }
        }
    }


    private void swap(int[] arr, int index01, int index02){
        int tmp = arr[index01];
        arr[index01] = arr[index02];
        arr[index02] = tmp;
    }
}
