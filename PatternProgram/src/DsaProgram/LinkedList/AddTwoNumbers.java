package DsaProgram.LinkedList;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Main {
        public static void main(String[] args) {
            // Creating list l1 = [2, 4, 3]
            ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

            // Creating list l2 = [5, 6, 4]
            ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

            ListNode l3 = new ListNode(9,
                    new ListNode(9,
                            new ListNode(9,
                                    new ListNode(9,
                                            new ListNode(9,
                                                    new ListNode(9,
                                                            new ListNode(9)))))));

            // Create l2 = [9,9,9,9]
            ListNode l4 = new ListNode(9,
                    new ListNode(9,
                            new ListNode(9,
                                    new ListNode(9))));

            AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
            ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

            ListNode result2 = addTwoNumbers.addTwoNumbers(l3, l4);

            System.out.println("\n 1st Test Case \n");
            // Print the result linked list
            while (result != null) {
                System.out.print(result.val);
                if (result.next != null) System.out.print(" -> ");
                result = result.next;
            }

            System.out.println("\n 2nd Test Case \n");

            while (result2 != null) {
                System.out.print(result2.val);
                if (result2.next != null) System.out.print(" -> ");
                result2 = result2.next;
            }
            System.out.println("\n");
            // Output: 7 -> 0 -> 8
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode current = resultHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            int sum = v1 + v2 + carry;

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return resultHead.next;
    }

}
