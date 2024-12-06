package listInterfaceOperations;

import java.util.ArrayList;

public class EvenOddNumAlternatively
{
    public static void main(String[] args)
    {
        int[] input={1,6,3,4,8,2,9};
        ArrayList<Integer> evenNum=new ArrayList<>();
        ArrayList<Integer> oddNum=new ArrayList<>();
        for(int number:input)
        {
            if(number%2==0){
                evenNum.add(number);
            }
            else {
                oddNum.add(number);
            }
        }
        int evenIndex=0,oddIndex=0;
        int evenSize=evenNum.size(),oddSize=oddNum.size();
        while(evenIndex<evenSize && oddIndex<oddSize)
        {
            System.out.print(evenNum.get(evenIndex++)+" ");
            System.out.print(oddNum.get(oddIndex++)+" ");
        }
        while(evenIndex<evenSize)
        {
            System.out.print(evenNum.get(evenIndex++)+" ");
        }
        while(oddIndex<oddSize)
        {
            System.out.print(oddNum.get(oddIndex)+" ");
        }
    }
}