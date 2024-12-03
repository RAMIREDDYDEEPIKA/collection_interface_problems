package queueInterface;

import java.util.*;

public class NonRepeatedChar
{
    Queue<Character> queue;
    Map<Character,Integer> charCount;

    public NonRepeatedChar()
    {
        this.queue=new LinkedList<>();
        this.charCount=new HashMap<>();
    }

    public void firstNonRepeatedChar(String input)
    {
        for(char ch:input.toCharArray())
        {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            queue.offer(ch);
        }
        while(!queue.isEmpty() && charCount.get(queue.peek())>1)
        {
            queue.poll();
        }
        if(!queue.isEmpty())
        {
            System.out.println(queue.peek());
        }
        else
        {
            System.out.println("No non-repeated character found");
        }
    }
    public static void main(String[] args)
    {
        NonRepeatedChar result=new NonRepeatedChar();
        String input="abcab";
        result.firstNonRepeatedChar(input);
    }
}