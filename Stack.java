public class Stack {
    int size;

    int top;

    int[] array;


    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }

    int pop() {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
        return array[previousTop];
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack");
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i] + "");
        }
        System.out.println();

    }

    public static void main(String[] args) {
    }
}

