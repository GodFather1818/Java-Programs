import java.util.Arrays;
import java.util.Stack;

public class Stacks {

    //    Custom stack Implementation
    int top = -1;
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    public Stacks() {
        this(DEFAULT_SIZE);
    }
    public Stacks(int size) {
        this.data = new int[size];
    }
    public boolean push(int item) {

        if(isFull()) {
            System.out.println("Stack is Full!");
        }
        top++;
        data[top] = item;
        return true;
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot Pop from an empty stack");
        }
        int poppedVariable = data[top];
        top--;
        return poppedVariable;
    }
    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot Peek from an Empty Stack");
        }
        return data[top];
    }
    public void display() {
        int i = 0;
        if(top == -1) {
            System.out.println("The Stack is Empty!!");
            return;
        }
        System.out.println("Current Stack: ");
        while(i<=top) {
            System.out.println(data[i]);
            i++;
        }
    }




    public static void main(String[] args) throws Exception {

//        Inbuilt Stacks Example
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Stacks newStack = new Stacks(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(18);
        newStack.push(5);
        newStack.push(67);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("The Popped Element from the Stack is: " + newStack.pop());
        newStack.display();
    }
}
