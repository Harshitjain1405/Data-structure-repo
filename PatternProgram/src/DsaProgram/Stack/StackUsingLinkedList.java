package DsaProgram.Stack;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    private Node top;

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Peek element: "+ stack.peek());
        System.out.println("Pop Element: "+ stack.pop());
    }

    private void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node curr = top;
        System.out.print("Stack: ");
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("\n");
    }

    private int pop() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty, so not able to pop the element");
        }
        int popped = top.data;
        top = top.next;

        return popped;
    }

    private int peek() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


}
