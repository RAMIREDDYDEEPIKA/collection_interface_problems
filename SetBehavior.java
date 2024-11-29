package setInterfaceOperations;

import java.util.*;

public class SetBehavior
{
    public static void createHashSet(int[] numbers)
    {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:numbers)
        {
            hashSet.add(num);
        }
        System.out.println("Hash Set elements are: "+hashSet);
    }

    public static void createLinkedHashSet(int[] numbers)
    {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        for(int num:numbers)
        {
            linkedHashSet.add(num);
        }
        System.out.println("Linked Hash Set elements: "+linkedHashSet);
    }

    public static void createTreeSet(int[] numbers)
    {
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int num:numbers)
        {
            treeSet.add(num);
        }
        System.out.println("Tree set elements are: "+treeSet);
    }

    public static void main(String[] args)
    {
        int[] numbers={1,4,2,5,3,6,7};
        createHashSet(numbers);
        createLinkedHashSet(numbers);
        createTreeSet(numbers);
    }
}