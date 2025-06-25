package DsaProgram.Queue;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data= data;
        }
    }
    private Node front, rear;

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued Element: "+ queue.dequeue());
        System.out.println("Peek Element: "+ queue.peek());
    }

    private void printQueue() {
        Node curr = front;
        System.out.println("Queue ");
        while( curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    private Integer peek() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }

    private Integer dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty to dequeue the element");
        }
        int val = front.data;
        front = front.next;

        if(front == null) {
            rear = null;
        }
        return val;
    }

    private Boolean isEmpty() {
        return front == null;
    }

    private void enqueue(int data) {
        Node newNode = new Node(data);
        if(rear == null) {
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
}
