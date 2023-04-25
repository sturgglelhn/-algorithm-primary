package class03;

/**
 * @author: 南哥
 * @date: 2023/4/26 15:01
 * @ClassName: Code03_BSNearRight
 *
 * 题目：有序数组中找到<=num 最右的位置
 */
public class Code03_BSNearRight {
    public static int nearestIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1; // 记录最右的对号
        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] <= value) {
                index = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        int value = 7;
        int result = nearestIndex(arr,value);
        System.out.println(result);
    }
}
