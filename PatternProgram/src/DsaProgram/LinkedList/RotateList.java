package DsaProgram.LinkedList;

/*
Given the head of a linked list, rotate the list to the right by k places.



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 */
public class RotateList {
    static class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        int k = 2;

        ListNode rotatedNodes = rotateList(listNode, k);

        while (rotatedNodes != null) {
            System.out.print(rotatedNodes.val + " ");
            rotatedNodes = rotatedNodes.next;
        }
    }

    private static ListNode rotateList(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;
        k = k % length;

        int newLength = length - k;

        ListNode newTail = head;

        for(int i = 1; i< newLength; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
