package class01;

import class01.lib.ListNode;

/**
 * @ClassName : Code03_Offer24_LinkedList
 * @Author : 南哥
 * @Date: 2023/4/20  19:44
 *
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *  输入: 1->2->3->4->5->NULL
 *  输出: 5->4->3->2->1->NULL
 */
public class Code03_Offer24_LinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        ListNode result = new Solution3().reverseList(head);

    }

}

//
class Solution3{
    public ListNode reverseList(ListNode head){
        ListNode cur = head, pre = null;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
