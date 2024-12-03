package queueInterface;

import java.util.*;

public class MaxSlidingWindow
{
    public static void maxSlidingWindow(int[] input,int k)
    {
        Deque<Integer> deque=new LinkedList<>();
        Queue<Integer> result=new LinkedList<>();

        for(int i=0;i<input.length;i++)
        {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && input[deque.peekLast()]<input[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result.add(input[deque.peekFirst()]);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        int[] input={1,2,5,3,-1,6,8,3,2,-5,7,4};
        int k=3;
        maxSlidingWindow(input,k);
    }
}