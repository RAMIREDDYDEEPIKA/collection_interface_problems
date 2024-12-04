package mapInterface;

import java.util.*;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,4,5,6,4};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if (entry.getValue()>1)
            {
                System.out.println("Element: "+entry.getKey()+" Count: "+entry.getValue());
            }
        }
    }
}