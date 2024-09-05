// 232. Implement Queue using Stacks
//Easy
//Topics
//Companies
//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
//
//Implement the MyQueue class:
//
//void push(int x) Pushes element x to the back of the queue.
//int pop() Removes the element from the front of the queue and returns it.
//int peek() Returns the element at the front of the queue.
//boolean empty() Returns true if the queue is empty, false otherwise.
//Notes:
//
//You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
//Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
//
//
//Example 1:
//
//Input
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 1, 1, false]
//
//Explanation
//MyQueue myQueue = new MyQueue();
//myQueue.push(1); // queue is: [1]
//myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
//myQueue.peek(); // return 1
//myQueue.pop(); // return 1, queue is [2]
//myQueue.empty(); // return false


import java.sql.SQLOutput;
import java.util.Stack;

public class LeetCode232 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public LeetCode232() {
        first = new Stack<>();
        second = new Stack<>();
    }

//    public MyQueue() {
//
//    }

    public void push(int x) {
        first.push(x);
    }

    public int pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }


    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        System.out.println(stack.pop());
        LeetCode232 queue = new LeetCode232();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);

        System.out.println("Elements in the Queue: " + queue.peek());
        System.out.println("Element popped from the Queue: " + queue.pop());
    }
}
