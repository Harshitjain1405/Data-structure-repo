package DsaProgram.LinkedList;

/*
iven the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 */
public class ReversedLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode reversedList = reversedBetween(listNode, 2, 4);
        printResultList(reversedList);
    }

    private static ListNode reversedBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        for(int i = 1; i< left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next;

        for(int i = 0; i< right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    private static void printResultList(ListNode reversedList) {
        while(reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
