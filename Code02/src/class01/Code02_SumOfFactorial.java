package class01;

/**
 * @ClassName : Code02_SumOfFactorial
 * @Author : 南哥
 * @Date: 2023/4/20  20:17
 */
public class Code02_SumOfFactorial {
    public static long f1(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    public static long factorial(int N) {
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    public static long f2(int N){
        long ans = 0;
        long cur = 1;
        for(int i = 1; i <= N; i++){
            cur *= i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println(f1(N));
        System.out.println(f2(N));
    }
}

/*
这个code是告诉我们，算法的重要性：
f1在每个乘积算出来后，然后在累加
f2是把上一个乘积的结果累加
明显在算法各种复杂度上f2都要优于f1。
让我们感受到了算法的解题思路的重要性
* */
