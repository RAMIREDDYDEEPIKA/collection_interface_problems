package setInterfaceOperations;

import java.util.*;

public class IntersectionOfSets
{
    public static void main(String[] args)
    {
        Set<Integer> set1=new HashSet<>(Set.of(1,4,3));
        Set<Integer> set2=new HashSet<>(Set.of(2,3,4));
        Set<Integer> set3=new HashSet<>(Set.of(3,4,6));
        intersection(set1,set2,set3);

        Set<Integer> setA=new TreeSet<>(Set.of(1,4,3));
        Set<Integer> setB=new TreeSet<>(Set.of(2,3,4));
        Set<Integer> setC=new TreeSet<>(Set.of(3,4,6));
        intersection(setA,setB,setC);

    }

    public static void intersection(Set<Integer>... data)
    {
        Set<Integer> result=new HashSet<>(data[0]);
        for(int i=1;i<data.length;i++)
        {
            result.retainAll(data[i]);
        }
        System.out.println("Intersection of Sets : "+result);
    }
}