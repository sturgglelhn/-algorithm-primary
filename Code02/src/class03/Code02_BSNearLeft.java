package class03;

import java.util.Arrays;

/**
 * @author: 南哥
 * @date: 2023/4/25 20:40
 * @ClassName: Code02_BSNearLeft
 * <p>
 * 题目：有序数组中找到>=num 最左的位置
 */
public class Code02_BSNearLeft {
    public static int mostLeftNoLessNumIndex(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return ans;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static int test(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= value){
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int value = 7;
        int result = mostLeftNoLessNumIndex(arr,value);
        System.out.println(result);
    }
        /*int testTime = 10000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if(test(arr,value) != mostLeftNoLessNumIndex(arr,value)){
                printArray(arr);
                //System.out.println(value);
                System.out.println(test(arr,value));
                System.out.println(mostLeftNoLessNumIndex(arr,value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice" : "Fucking fucked!");
    }*/
}
