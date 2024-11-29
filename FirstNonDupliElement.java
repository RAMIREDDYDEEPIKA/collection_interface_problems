package setInterfaceOperations;

import java.util.*;

public class FirstNonDupliElement
{
    public static void main(String[] args)
    {
        int[] numbers={3,2,4,5,3,2,8};
        System.out.println(firstNonDuplicate(numbers));
    }
    public static int firstNonDuplicate(int[] numbers)
    {
        LinkedHashSet<Integer> unique=new LinkedHashSet<>();
        LinkedHashSet<Integer> duplicate=new LinkedHashSet<>();
        for(int num:numbers)
        {
            if(duplicate.contains(num)){
                continue;
            }
            if(unique.contains(num)){
                unique.remove(num);
                duplicate.add(num);
            }
            else{
                unique.add(num);
            }
        }
        for(int result:unique)
        {
            return result;
        }
        return -1;
    }
}