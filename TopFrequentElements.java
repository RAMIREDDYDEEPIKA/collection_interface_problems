package mapInterface;

import java.util.*;

public class TopFrequentElements
{
    public static void main(String[] args)
    {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        topKFrequent(nums,k);
    }

    public static void topKFrequent(int[] nums,int k)
    {
        Map<Integer,Integer> frequencyMap=new HashMap<>();

        for (int num:nums)
        {
            frequencyMap.put(num,frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((entry1,entry2) -> entry2.getValue() - entry1.getValue());

        List<Integer> result = new ArrayList<>();
        for (int i=0;i<k;i++)
        {
            result.add(entryList.get(i).getKey());
        }
        System.out.println("Top frequent elements: "+result);
    }
}