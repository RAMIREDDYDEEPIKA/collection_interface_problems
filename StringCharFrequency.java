package mapInterface;

import java.util.*;

public class StringCharFrequency
{
    public static void charFrequency(String input)
    {
        Map<Character,Integer> frequency=new HashMap<>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)!=' ') {
                char ch = input.charAt(i);
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(frequency);
    }
    public static void main(String[] args)
    {
        String input="hello world";
        charFrequency(input);
    }
}