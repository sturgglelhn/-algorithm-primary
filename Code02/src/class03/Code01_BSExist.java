package class03;

import java.util.Arrays;

/**
 * @author: 南哥
 * @date: 2023/4/25 19:56
 * @ClassName: Code03_BSExist
 * <p>
 * 题目：有序数组中找到num
 */
public class Code01_BSExist {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target1 = 9;
        int result = binarySearch(arr,target1);
        System.out.println(result);
    }

    // 二分查找
    /*public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        // arr[0...N-1] num  arr[L...R] num
        while (L <= R) {
            int mid = (L + R) / 2;  //有坑
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return false;
    }*/

    /*public static boolean test(int[] sortedAdd, int num){
        for(int cur : sortedAdd){
            if(cur == num){
                return true;
            }
        }
        return false;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for(int i = 0; i < testTime; i++){
            int[] arr = generateRandomArray(maxSize,maxValue);
            Arrays.sort(arr);
            int value = (int)((maxValue + 1) * Math.random()) - (int)(maxValue * Math.random());
            if(test(arr,value) != find(arr,value)){
                System.out.println("出错了！");
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nick" : "Fucking fucked");
    }*/
}
