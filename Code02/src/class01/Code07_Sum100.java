package class01;

/**
 * @author: 南哥
 * @date: 2023/4/26 14:02
 * @ClassName: Code07_Sum100
 *
 * 感受一下算法的魅力，累加求和
 * Sum1和Sum2两个例子同样是累加求和，但是一个是(N + 1) * N / 2，一个是从1开始加到100,显而易见Sum1效率高，Sum1是n阶
 */
public class Code07_Sum100 {
    public static void main(String[] args) {
        int result1 = Sum1(100);
        int result2 = Sum2(100);
        System.out.println(result1);
        System.out.println(result2);
    }

    // 累加求和
    public static int Sum1(int N){
        int sum = 0;
        sum = (N + 1) * N / 2;
        return sum;
    }

    //累加求和
    public static int Sum2(int N){
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
}
/*
这就是算法的，同样的一个题目解题的方式、效率，会有很大的区别。
* */