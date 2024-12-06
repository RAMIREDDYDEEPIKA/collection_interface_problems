package listInterfaceOperations;

public class StringReplacement
{
    public static void main(String[] args)
    {
        String input="aaadvbi";
        char[] strCopy=input.toCharArray();
        for(int i=0;i<strCopy.length-1;i++)
        {
            if(strCopy[i]==strCopy[i+1])
            {
                boolean swap = false;
                for (int j = i + 1; j < strCopy.length - 1; j++)
                {
                    if(strCopy[i]!=strCopy[j])
                    {
                        char temp = strCopy[i+1];
                        strCopy[i+1] = strCopy[j];
                        strCopy[j] = temp;
                        swap=true;
                        break;
                    }
                }
                if(!swap){
                    System.out.println("not possible to swap");
                    return;
                }
            }
        }
        System.out.println("result : "+new String(strCopy));
    }
}