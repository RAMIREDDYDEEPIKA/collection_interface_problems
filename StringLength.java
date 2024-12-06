package listInterfaceOperations;

public class StringLength
{
    public static void main(String[] args)
    {
        String str="hello";
        int count=stringLength(str,0);
        System.out.println(count);
    }
    public static int stringLength(String str,int count)
    {
        if(str==null || str.isEmpty())
        {
            return count;
        }
        return stringLength(str.substring(1),count+1);
    }
}