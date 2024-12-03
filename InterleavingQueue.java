package queueInterface;

import java.util.*;

public class InterleavingQueue
{
    public static void interChanged(Queue<Integer> input)
    {
        if(input.size()%2!=0) {
            System.out.println("queue are not having even number of elements");
        }
        int halfSize=input.size()/2;
        Queue<Integer> firstHalf=new LinkedList<>();

        for(int i=0;i<halfSize;i++){
            firstHalf.add(input.poll());
        }
        System.out.println("first half elements; "+firstHalf);

        while(!firstHalf.isEmpty()){
            input.add(firstHalf.poll());
            input.add(input.poll());
        }
    }

    public static void main(String[] args)
    {
        Queue<Integer> input=new LinkedList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        System.out.println("Original queue : "+input);
        interChanged(input);
        System.out.println("After interLeaving : "+input);
    }
}