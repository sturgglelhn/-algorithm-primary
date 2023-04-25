package class03;

/**
 * @author: 南哥
 * @date: 2023/4/25 20:40
 * @ClassName: Code02_BSNearLeft
 *
 * 题目：有序数组中找到<= num最右的位置
 *
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

}
