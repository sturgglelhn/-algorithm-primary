package class01;

/**
 * @author: 南哥
 * @date: 2023/4/25 19:36
 * @ClassName: Code06_InsertionSort
 */
public class Code06_InsertionSort {

    // 两个数值交换
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void insertionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {  // 0 ~ i做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr,j , j + 1);
            }
        }
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int)((maxSize + 1) * Math.random())];  //长度随机
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) ((maxSize + 1) * Math.random()) - (int)(maxValue * Math.random());
        }
        return arr;
    }

    public static void printSort(int[] arr){
        if(arr == null){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 30;   // 随机数组的长度0~30
        int maxValue = 100; //值： -100 ~ 100
        for(int i = 0; i < testTime; i++){
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            insertionSort(arr1);
        }
        int[] arr = generateRandomArray(maxSize,maxValue);
        printSort(arr);
        insertionSort(arr);
        printSort(arr);
    }

}
