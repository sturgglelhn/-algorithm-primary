package class01;

/**
 * @ClassName : Code01_PrintBinary
 * @Author : 南哥
 * @Date: 2023/4/20  20:08
 * <p>
 * 得到一个数值的32bit
 */
public class Code01_PrintBinary {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }

    public static void main(String[] args) {
        int c = 16;
        print(c);
    }
}
