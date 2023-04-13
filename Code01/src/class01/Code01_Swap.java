package class01;

/**
 * @ClassName : Code01_Swap
 * @Author : 南哥
 * @Date: 2023/4/13  20:32
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Code01_Swap {
    public static void main(String[] args) {
        String s = "We are happy.";
        String result = new Solution().replaceSpace(s);
        System.out.println(result);
    }
}


class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray()){
            if(c == ' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
