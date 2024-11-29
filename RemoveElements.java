package setInterfaceOperations;

import java.util.*;

public class RemoveElements
{
    public static void main(String[] args)
    {
        Set<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original Set : "+numbers);
        removeElements(new TreeSet<>(numbers),30);
    }
    public static void removeElements(TreeSet<Integer> numbers,int threshold)
    {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            Integer number = iterator.next();
            if (number < threshold) {
                iterator.remove();
            }
        }
        System.out.println("Result : "+numbers);
    }
}