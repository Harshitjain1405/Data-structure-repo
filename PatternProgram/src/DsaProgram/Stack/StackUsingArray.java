package DsaProgram.Stack;

public class StackUsingArray {
    private int[] stack;
    private int capacity;
    private int top;

    StackUsingArray(int size) {
        this.capacity = size;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

        System.out.println("Peek element : "+stack.peek());
        System.out.println("Popped element: "+ stack.pop());

        System.out.println("Peek element after popped: "+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    private int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty and not able to pop the element");
            return -1;
        }
        return stack[top --];
    }

    private int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    private void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack");
        for(int i = top; i > 0 ; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println("\n");
    }

    private Boolean isEmpty() {
        return top == -1;
    }

    private void push(int data) {
        if(isFull()) {
            System.out.println("Element cannot be pushed in the stack");
            return;
        }
        stack[++top] = data;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}
