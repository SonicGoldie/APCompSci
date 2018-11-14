package Projects;
import java.util.Scanner;
import java.io.*;
public class PunctCounter 
{
  public static Scanner inFile;
  public static void main(String[] args) throws IOException 
  {
    FileReader file = new FileReader("C:\\Users\\socce\\eclipse-workspace\\APCompSci\\Chapter5\\Projects\\Inaugrial Address.txt");
   Scanner inFile = new Scanner(file);
    String line;
   char symbol;
    int  periodCt = 0;
    int  commaCt = 0;
    int  questionCt = 0;
    int  colonCt = 0;
    int  semicolonCt = 0;
    char  blankCt = 0;
    int  count; 
    
    while (inFile.hasNextLine())
    {  
      line = inFile.nextLine();
      count = 0;
    while (count < line.length())
    {
        symbol = line.charAt(count);
        count++;
    }     
      for (int i = 0; i < line.length(); i++)
      {char c = line.charAt(i);
         if (c == '.')
         periodCt++;
       else if (c == ',')
         commaCt++;
       else if (c == '?')
         questionCt++;
       else if (c == ':')
         colonCt++;
       else if (c == ';')
         semicolonCt++;
       else if (c == ' ')
         blankCt++;
      } 
    } 
   System.out.println("Number of periods: " + periodCt);
   System.out.println("Number of commas: " + commaCt);
   System.out.println("Number of question marks: " + questionCt);
   System.out.println("Number of colons: " + colonCt);
   System.out.println("Number of semicolons: " + semicolonCt);
   System.out.println("Number of blanks: " + blankCt);
  }
}
