package setInterfaceOperations;

import java.util.TreeSet;

public class SortedUniqueElements
{
    public static void main(String[] args)
    {
        int[] numbers={12,8,3,4,36,3,5,7,1,9};
        System.out.println("Sorted the set elements of removing dupliactes : "+sortedUniqueElements(numbers));
    }
    public static TreeSet sortedUniqueElements(int[] numbers)
    {
        TreeSet<Integer> sortedElements=new TreeSet<>();
        for(int num:numbers)
        {
            sortedElements.add(num);
        }
        return sortedElements;
    }
}