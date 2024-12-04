package mapInterface;

import java.util.*;

public class SortByValues
{
    public static void sortingByValues(Map<String,Integer> input)
    {
        List<String> keyData=new ArrayList<>(input.keySet());
        Collections.sort(keyData, new Comparator<String>()
        {
            public int compare(String key1, String key2)
            {
                return input.get(key1).compareTo(input.get(key2));
            }
        });
        for (String key : keyData)
        {
            System.out.println(key + ": " + input.get(key));
        }
    }

    public static void main(String[] args)
    {
        Map<String,Integer> input=new HashMap<>();
        input.put("Asha",2);
        input.put("Usha",1);
        input.put("Disha",4);
        input.put("Nisha",5);
        input.put("Ooha",3);
        sortingByValues(input);
    }
}