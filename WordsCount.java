package mapInterface;

import java.io.File;
import java.util.*;

public class WordsCount
{
    public static void main(String[] args)
    {
        String filePath="src\\mapInterface\\WordCountFile.txt";
        Map<String,Integer> wordCount=new HashMap<>();
        File file=new File(filePath);
        if(file.exists() && file.isFile())
        {
            Scanner sc=null;
            try
            {
                sc=new Scanner(file);
                while(sc.hasNext())
                {
                    String word=sc.next().toLowerCase();
                    word.replaceAll("[^a-zA-Z0-9]","");
                    if(!word.isEmpty())
                    {
                        wordCount.put(word, wordCount.getOrDefault(word,0)+1);
                    }
                }
                System.out.println(wordCount);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            finally
            {
                if(sc!=null){
                    sc.close();
                }
            }
        }
        else{
            System.out.println("file not found");
        }
    }
}