package listInterfaceOperations;

public class PrintNum
{
    public static void main(String[] args)
    {
        printNum(1);
    }
    public static void printNum(int num)
    {
        if(num<10) {
            System.out.println(num + " ");
            printNum(num + 1);
        }
    }
}