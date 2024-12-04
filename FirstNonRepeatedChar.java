package mapInterface;

import java.util.*;

public class FirstNonRepeatedChar
{
    public static void main(String[] args)
    {
        String input="aabcbc";
        nonRepeatedChar(input);
    }
    public static void nonRepeatedChar(String input)
    {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char ch :input.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if (entry.getValue() == 1)
            {
                System.out.println("First non-repeated character: "+entry.getKey());
                return;
            }
        }
        System.out.println("Not found non-repeated character");
    }
}