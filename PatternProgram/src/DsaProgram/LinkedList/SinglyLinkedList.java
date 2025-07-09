package DsaProgram.LinkedList;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtSpecificPosition(15, 1);
        list.display();
        list.findMiddle();
        list.reverseList();
        list.display();

        list.deleteByKey(15);
        list.display();
        list.deleteByPosition(1);
        list.display();

        System.out.println("Found 10? : " + list.search(10));
        System.out.println("size: " + list.getSize());

    }

    private void findMiddle() {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle value : "+slow.data);
    }

    private void reverseList() {
        Node last = null;
        Node curr = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = last;
            last = curr;
            curr = next;
        }
        head = last;
    }

    private Integer getSize() {
        return size;
    }

    private Boolean search(int searchedData) {
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == searchedData) {
                return true;
            }
        }
        return false;
    }

    private void deleteByPosition(int pos) {
        if (pos < 0 || pos > size || head == null) {
            throw new IndexOutOfBoundsException("Invalid position to delete : " + pos);
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        if(curr.next != null) {
            curr.next = curr.next.next;
        }
        size --;
    }

    private void deleteByKey(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
        } else {
            Node curr = head;
            while (curr.next != null && curr.next.data != data) {
                curr = curr.next;
            }
            if (curr.next != null) {
                curr.next = curr.next.next;
            }
            size--;
        }
    }

    private void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null\n");
    }

    private void insertAtSpecificPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position : " + pos);
        }
        if (pos == 0) {
            insertAtHead(data);
        } else {
            Node curr = head;
            for (int i = 0; i < pos - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    private void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    private void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
}
