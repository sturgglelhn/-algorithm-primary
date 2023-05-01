package class04;

/**
 * @author: 南哥
 * @date: 2023/5/1 23:01
 * @ClassName: Code01_ReverseList
 */
public class Code01_ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            value = data;
        }
    }

    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data){
            value = data;
        }
    }

    // 单链表反转
    public static Node reverseLinkedList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    // 双向链表反转
    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);

        DoubleNode n2 = new DoubleNode(4);
        n2.next = new DoubleNode(5);
        n2.next.next = new DoubleNode(6);
        //n1 = reverseLinkedList(n1);
        n2 = reverseDoubleList(n2);

        while(n2 != null){
            System.out.print(n2.value + " ");
            n2 = n2.next;
        }
        System.out.println();
    }
}
