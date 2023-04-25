package class02;

/**
 * @author: 南哥
 * @date: 2023/4/25 17:18
 * @ClassName: Code03_Comp
 */
public class Code03_Comp {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 返回一个数组arr，arr长度[0,maxLen - 1]，arr中的每个值[0，maxValue - 1]
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static void printSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxLen = 5;
        int maxValue = 10;
        int testTime = 10;
        for(int i = 0; i < testTime; i++){
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            selectionSort(arr1);
            printSort(arr1);
        }
    }
}
