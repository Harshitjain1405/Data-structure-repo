package DsaProgram.LinkedList;

/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false

 */
public class PalindromeList {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        boolean isPal = isPalindrome(listNode);

        System.out.println(isPal);

    }

    private static boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reversePal(slow);
        ListNode firstHalf = head;

        while(secondHalf != null) {
            if(firstHalf.val != secondHalf.val) return false;

            firstHalf =firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }

    private static ListNode reversePal(ListNode slow) {
        ListNode prev = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        return prev;
    }
}
