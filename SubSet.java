package setInterfaceOperations;

import java.util.*;

public class SubSet
{
    public static void main(String[] args)
    {
        int[] setA = {3, 2};
        int[] setB = {1, 2, 3, 6};
        System.out.println("In hash Set implementation : "+hashSetSubSet(setA, setB));
        System.out.println("In linked list implementation : "+linkedHashSet(setA,setB));
        System.out.println("In tree set implementation : "+treeSet(setA,setB));
    }

    public static boolean hashSetSubSet(int[] setA, int[] setB) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < setA.length; i++) {
            set1.add(setA[i]);
        }
        for (int i = 0; i < setB.length; i++) {
            set2.add(setB[i]);
        }
        if (set2.containsAll(set1)) {
            return true;
        }
        else {
            System.out.println("set1 is not a subset of set2");
        }
        return true;
    }

    public static boolean linkedHashSet(int[] setA,int[] setB)
    {
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();
        for(int i=0;i<setA.length;i++)
        {
            set1.add(setA[i]);
        }
        for(int i=0;i<setB.length;i++)
        {
            set2.add(setB[i]);
        }
        if (set2.containsAll(set1)) {
            return true;
        }
        else {
            System.out.println("set1 is not a subset of set2");
        }
        return true;
    }

    public static boolean treeSet(int[] setA,int[] setB)
    {
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        for(int i=0;i<setA.length;i++)
        {
            set1.add(setA[i]);
        }
        for(int i=0;i<setB.length;i++)
        {
            set2.add(setB[i]);
        }
        if (set2.containsAll(set1)) {
            return true;
        }
        else {
            System.out.println("set1 is not a subset of set2");
        }
        return true;
    }
}