package Projects;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class NumberReader
{
    public static void main(String[] args)
    throws IOException
    {
        Scanner textfile = new Scanner(new File("C:\\Users\\socce\\eclipse-workspace\\APCompSci\\Chapter5\\Projects\\Numbers.txt"));

        filereader(textfile);
    }   


    static void filereader(Scanner textfile)     
    {         
        int i = 0;         
        int sum = 0;          
        while(i <= 49)         
        {       
            int nextInt = textfile.nextInt();          

            System.out.println(nextInt);             
            sum = sum + nextInt;
            i++;         
        }
        System.out.println("The sum is: "+ sum);
    }



}