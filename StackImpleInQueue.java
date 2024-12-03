package queueInterface;

import java.util.*;

public class StackImpleInQueue
{
    private Queue<Integer> queue1=new LinkedList<>();
    private Queue<Integer> queue2=new LinkedList<>();

    public void push(int x)
    {
        queue2.add(x);
        while(!queue1.isEmpty())
        {
            queue2.add(queue1.remove());
        }
        System.out.println("Added : "+queue2);
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
    }

    public void pop()
    {
        if(queue1.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("popped : "+queue1.remove());
        }
    }

    public void peek()
    {
        if(queue1.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Top element "+queue1.peek());
        }
    }

    public void isEmpty()
    {
        System.out.println("stack is empty :"+queue1.isEmpty());
    }

    public static void main(String[] args)
    {
        StackImpleInQueue stack=new StackImpleInQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.isEmpty();
        stack.pop();
    }
}