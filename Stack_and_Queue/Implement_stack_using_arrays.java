package Stack_and_Queue;

public class Implement_stack_using_arrays {
    private int[] stack;
    private int top;
    private int maxSize;

    public Implement_stack_using_arrays(int size) {
        stack = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Implement_stack_using_arrays stack = new Implement_stack_using_arrays(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Current size of the stack: " + stack.size());

        stack.push(60);

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Popped element: " + stack.pop());
    }
}