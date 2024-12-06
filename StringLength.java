package listInterfaceOperations;

public class StringLength
{
    public static void main(String[] args)
    {
        String str="hello world";
        int result=stringLength(str,0);
        System.out.println(result);
    }
    public static int stringLength(String str,int count)
    {
        if(str==null || str.isEmpty())
        {
            return count;
        }
        if(str.charAt(0)!=' ')
        {
            count++;
        }
        return stringLength(str.substring(1),count);
    }
}