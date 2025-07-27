package DsaProgram.LinkedList;

/*
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)



Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:



Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]
 */
public class SwapNodeInPairs {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);

        Node swappedNode = swapNode(node);
        while(swappedNode != null) {
            System.out.print(swappedNode.val + " ");
            swappedNode =swappedNode.next;
        }
    }

    private static Node swapNode(Node node) {
        if(node == null) return null;
        Node dummy = new Node(0);
        dummy.next = node;

        Node prev = dummy;

        while(prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
        return dummy.next;
    }
}
