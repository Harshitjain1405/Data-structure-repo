package DsaProgram.LinkedList;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);
        cll.display(); // 5 -> 10 -> 20 -> 30 -> (back to head)

        cll.deleteByValue(20);
        cll.display(); // 5 -> 10 -> 30 -> (back to head)

        System.out.println("Found 30? " + cll.search(30)); // true
        System.out.println("Found 50? " + cll.search(50)); // false
    }

    private Boolean search(int val) {
        Node curr = head;
        do {
            if(curr.data == val) return true;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    private void deleteByValue(int data) {
        if (head == null) return;
        if(head.data == data && head == tail) {
            head = tail = null;
            return;
        }
        Node curr = head;
        Node prev = null;

        do {
            if(curr.data == data) {
                if(curr == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                    if(curr == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }while (curr != head);
    }

    private void display() {
        if(head == null) {
            System.out.println("CircularLinked List is empty");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.print("(back to head)\n");
    }

    private void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }

    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
}
