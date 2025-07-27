package DsaProgram.LinkedList;

/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.



Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]

 */
public class RemoveDuplicate {
    static class RemoveNode {
        int val;
        RemoveNode next;

        RemoveNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        RemoveNode removeNode = new RemoveNode(1);
        removeNode.next = new RemoveNode(2);
        removeNode.next.next = new RemoveNode(3);
        removeNode.next.next.next = new RemoveNode(3);
        removeNode.next.next.next.next = new RemoveNode(3);
        removeNode.next.next.next.next.next = new RemoveNode(4);
        removeNode.next.next.next.next.next.next = new RemoveNode(4);
        removeNode.next.next.next.next.next.next.next = new RemoveNode(5);

        RemoveNode removeDuplicateNode = removeDuplicates(removeNode);

        while (removeDuplicateNode != null) {
            System.out.print(removeDuplicateNode.val+ " ");
            removeDuplicateNode = removeDuplicateNode.next;
        }
    }

    private static RemoveNode removeDuplicates(RemoveNode removeNode) {
        if(removeNode == null) return null;

        RemoveNode dummy = new RemoveNode(0);
        dummy.next = removeNode;

        RemoveNode prev = dummy;
        RemoveNode current = removeNode;

        while(current != null) {
            if(current.next != null && current.next.val == current.val) {
                int dupVal = current.val;
                while (current!= null && current.val == dupVal) {
                    current = current.next;
                }
                prev.next = current;
            } else {
                prev = prev.next;
                current = current.next;
            }

        }

        return dummy.next;
    }


}
