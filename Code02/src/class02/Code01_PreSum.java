package class02;


/**
 * @author: 南哥
 * @date: 2023/4/25 15:54
 * @ClassName: Code01_PreSum
 * <p>
 * 把数组中的每一个元素相加，对比RangeSum1和RangeSum2那个算法更好
 */
public class Code01_PreSum {
    public static class RangeSum1 {
        private int[] arr;

        public RangeSum1(int[] array) {
            arr = array;
        }

        public int rangeSum(int L, int R) {
            int sum = 0;
            for (int i = L; i <= R; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }

    public static class RangeSum2 {
        private int[] preSum;

        public RangeSum2(int[] array) {
            int N = array.length;
            preSum = new int[N];       //初始化数组
            preSum[0] = array[0];      //让preSum[0]置为前缀
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i - 1] + array[i];      //这段代码的含义是：preSum[i]是preSum的前i个元素加array，for通过遍历整个数组完成preSum的计算。
            }
        }

        public int rangeSum(int L, int R) {
            return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];  //等于0，就直接返回R值；不等于0，就preSum[R] - preSum[L - 1]，preSum[3]-preSum[1-1] = 17 - 3 : 14
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1};
        //RangeSum1 rs = new RangeSum1(arr);
        RangeSum2 rs = new RangeSum2(arr);
        int sum = rs.rangeSum(1, 3);
        System.out.println(sum);
    }
}
