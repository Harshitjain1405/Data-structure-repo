package DsaProgram.LinkedList;

/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.



Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

 */
public class OddAndEvenList {
    static class OddEvenNode {
        int val;
        OddEvenNode next;

        OddEvenNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        OddEvenNode oddEvenNode = new OddEvenNode(1);
        oddEvenNode.next = new OddEvenNode(2);
        oddEvenNode.next.next = new OddEvenNode(3);
        oddEvenNode.next.next.next = new OddEvenNode(4);
        oddEvenNode.next.next.next.next = new OddEvenNode(5);

        OddEvenNode resultNode = oddEvenList(oddEvenNode);

        while(resultNode!= null) {
            System.out.print(resultNode.val + " ");
            resultNode = resultNode.next;
        }
    }

    private static OddEvenNode oddEvenList(OddEvenNode oddEvenNode) {
        OddEvenNode oddNode = oddEvenNode;
        OddEvenNode evenNode = oddEvenNode.next;
        OddEvenNode even = evenNode;

        while(evenNode != null) {
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;

            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = even;
        return oddEvenNode;
    }
}
