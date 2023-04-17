package class01;

import class01.lib.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * @ClassName : Code02_Offer06_hardend
 * @Author : 南哥
 * @Date: 2023/4/17  19:07
 *
 *  剑指 Offer 06. 从尾到头打印链表
 *  输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *示例 1:
 *  输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 */
public class Code02_Offer06_hardend {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] result = new Solution2().reversePrint(head);
        for (int num: result){
            System.out.print(num+ " ");
        }
    }
}

// 递归法
class Solution2{
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head){
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = tmp.get(i);
        }
        return res;
    }
    void recur(ListNode head){
        if(head == null){
            return;
        }
        recur(head.next);
        tmp.add(head.val);
    }
}

/*class Solution2{
    public int[] reversePrint(ListNode head){
        //计数就完事=-=
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count++;
        }

        int[] arr = new int[count];

        cur = head;
        count--;
        while(cur != null && count >= 0){
            arr[count--] = cur.val;
            cur = cur.next;
        }
        return arr;
    }
}*/

// 辅助栈法，使用栈先进后出的特点，遍历到数组中
/*class Solution2{
    public int[] reversePrint(ListNode head){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = stack.removeLast();
        }
        return res;
    }
}*/
