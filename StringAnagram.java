package mapInterface;

import java.util.*;

public class StringAnagram
{
    public static void anagramCheck(String[] input)
    {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:input)
        {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedStr=new String(ch);
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        for(List<String> group:map.values())
        {
            System.out.println("Anagrams list "+group);
        }
    }

    public static void main(String[] args)
    {
        String[] input={"eat", "tea", "tan", "ate", "nat", "bat"};
        anagramCheck(input);
    }
}