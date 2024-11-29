package setInterfaceOperations;

import java.util.*;

public class PerformanceComparison
{
    public static void main(String[] args)
    {
        int dataSize=1000000;
        System.out.println("For hash Set :");
        performanceMeasure(new HashSet<>(),dataSize);

        System.out.println("For LinkedHashSet :");
        performanceMeasure(new LinkedHashSet<>(),dataSize);

        System.out.println("For TreeSet :");
        performanceMeasure(new TreeSet<>(),dataSize);
    }

    public static void performanceMeasure(Set<Integer> set,int dataSize)
    {
        long startTime=0,endTime=0;
        startTime=System.nanoTime();
        for(int i=0;i<dataSize;i++){
            set.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("performance measure for ADD operation of Data Size "+dataSize+" are "+(endTime-startTime)/1000000+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<dataSize;i++){
            set.remove(i);
        }
        endTime=System.nanoTime();
        System.out.println("performance measure for  REMOVE operation of Data size "+dataSize+" are "+(endTime-startTime)/1000000+" ns");

        startTime=System.nanoTime();
        for(int i=0;i<dataSize;i++){
            set.contains(i);
        }
        endTime=System.nanoTime();
        System.out.println("performance measure for Contains operation of Data size "+dataSize+" are "+(endTime-startTime)/1000000+" ns");
    }
}