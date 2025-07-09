package DsaProgram.LinkedList;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    private Node head, tail;
    private int size;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtPosition(15, 1); // insert between 10 and 20

        dll.displayForward();  // 10 <-> 15 <-> 20 <-> 30 <-> null
        dll.displayBackward(); // 30 <-> 20 <-> 15 <-> 10 <-> null

        dll.deleteByValue(20);
        dll.displayForward();  // 10 <-> 15 <-> 30 <-> null

        dll.deleteAtPosition(1);
        dll.displayForward();  // 10 <-> 30 <-> null

        System.out.println("Found 30? " + dll.search(30)); // true
        System.out.println("Size: " + dll.getSize());
    }

    private Integer getSize() {
        return size;
    }

    private Boolean search(int data) {
        Node curr = head;
        while(curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    private void deleteAtPosition(int pos) {
        if(pos <0 || pos > size) {
            throw new IndexOutOfBoundsException("Inavlid position to delete the node : "+pos);
        }
        if(pos == 0) {
            head = head.next;
            if(head != null) head.prev = null;
            else tail = null;
        } else if(pos == size - 1) {
            tail = tail.prev;
            if(tail != null) tail.next = null;
            else head = null;
        } else {
            Node curr = head;
            for(int i = 0; i< pos; i++) { //10 <-> 20 <-> 30
                curr = curr.next;
            }

            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
        }
        size --;

    }

    private void deleteByValue(int data) {
        if(head.data == data) {
            head = head.next;
            if(head != null) head.prev = null;
            else tail = null;
            size --;
            return;
        }
        Node curr = head;
        while(curr != null && curr.data != data) { // 10<->15<->20<->30
            curr = curr.next;
        }
        if (curr == null) return;
        if(curr.next != null) {
            curr.next.prev = curr.prev;
        } else {
            tail = curr.prev;
        }
        if( curr.prev != null) {
            curr.prev.next = curr.next;
        }
        size --;
    }

    private void displayBackward() {
        Node curr = tail;
        System.out.println("Backward display");
        while(curr != null) {
            System.out.print(curr.data +" <-> ");
            curr = curr.prev;
        }
        System.out.print("null\n");
    }

    private void displayForward() {
        Node curr = head;
        System.out.println("Forward display");
        while(curr != null) {
            System.out.print(curr.data +" <-> ");
            curr = curr.next;
        }
        System.out.print("null\n");
    }

    private void insertAtPosition(int data, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position : " + pos);
        }
        if (pos == 0) {
            insertAtHead(data);
        } else if (pos == size) {
            insertAtTail(data);
        } else {
            Node newNode = new Node(data);
            Node curr = head;
            for(int i = 0; i< pos -1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next; // 10<->20<-> 30
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
            size ++;
        }
    }

    private void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    private void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }
}
