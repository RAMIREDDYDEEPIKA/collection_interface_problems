package setInterfaceOperations;

import java.util.LinkedHashSet;

public class InsertionOrder
{
    public static void main(String[] args)
    {
        String[] data={"apple","banana","orange","banana","apple"};
        System.out.println("Insertion order of given data : "+insertionOrder(data));
    }
    public static LinkedHashSet insertionOrder(String[] data)
    {
        LinkedHashSet<String> result=new LinkedHashSet<>();
        for(String str:data)
        {
            result.add(str);
        }
        return result;
    }
}