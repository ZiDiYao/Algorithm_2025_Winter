package Heap;
public class Heapify {
    public void heapify01(int[] arr, int index, int heapSize){
        int left = index*2 +1;
        // 证明不仅仅有左子点还有右子点
        while (left < heapSize){
            // 查看是左子点还有右子点大
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            // 父节点和子节点比大小
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index*2+1;
        }
    }

    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
