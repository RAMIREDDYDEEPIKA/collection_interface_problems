package StackInterface;

import java.util.Stack;

public class MinStack
{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val)
    {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
        {
            minStack.push(val);
        }
    }

    public void pop()
    {
        if (stack.isEmpty()) {
            return;
        }
        int popped = stack.pop();
        if (popped == minStack.peek())
        {
            minStack.pop();
        }
    }

    public int top()
    {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    public static void main(String[] args)
    {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.push(2);
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}