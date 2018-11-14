package Projects;
import java.util.Scanner;
import java.io.*;
 
   public class Golf
   {
      private final static int NUMBER_OF_PLAYERS = 5; // this number includes par as a player
      private final static int NUMBER_OF_HOLES = 18; 
      private final static String DELIMITER = "\t"; // tab is a good delimiter
    
      public static int[] totalScores(int[][] scoreSheet) 
      {
      // create an array of the toal values for each player 
         int[] totals = new int[NUMBER_OF_PLAYERS]; 
       
         for (int player = 0; player < NUMBER_OF_PLAYERS; player++) 
         { 
            for (int hole = 0; hole < NUMBER_OF_HOLES; hole++) 
            { 
               int score = scoreSheet[player][hole]; 
               totals[player] += score; 
            } 
         } 
         return totals; 
      } 
    
    
      public static void main (String[] args) throws IOException
      {
      // initialize local variables
         int[][] scoreSheet = new int[NUMBER_OF_PLAYERS][NUMBER_OF_HOLES];
         String[] golfers;
         Scanner scanner = new Scanner(new File("C:\\Users\\socce\\eclipse-workspace\\APCompSci\\Chapter5\\Projects\\GolfScores.txt"));
       
      // read in the names of the golfers from the text file
         String string = scanner.nextLine();
         golfers = string.split(DELIMITER);
       
      // read in the scores from the text file
         {
            int hole = 0;
            while (scanner.hasNextLine())
            {
               string = scanner.nextLine();
               String[] scoresForOneHole = string.split(DELIMITER); 
               for (int player = 0; player < NUMBER_OF_PLAYERS; player++) {
               scoreSheet[player][hole] += Integer.parseInt(scoresForOneHole[player].trim());  
               }
               hole++;
            }
            
         }
       
      //scores
       
       
      // print out a list of the player names
         System.out.print("\t");
         for (int player = 0; player < NUMBER_OF_PLAYERS; player++) {
            System.out.print(golfers[player] + "\t");
         }
         System.out.println();
       
      // print out a table with the players' scores on it
         for (int hole = 0; hole < NUMBER_OF_HOLES; hole++) {
            System.out.print("Hole" + (hole+1)+ ":\t");
            for (int player = 0; player < NUMBER_OF_PLAYERS; player++) {
               System.out.print(scoreSheet[player][hole] + "\t");
            }
            System.out.println();
          
         }
      // total each players score
          int[] totals = totalScores(scoreSheet);
          System.out.println("____________________________________________");
          System.out.print("Totals:\t");
          for(int t: totals){
              System.out.print(t+"\t");
          }
          int min = totals[1];
          int minIndex = 1;
          int k;
          for (k = 1; k < totals.length; k++) {
              if (totals[k] < min) {
                  min = totals[k];
                  minIndex = k;
              }
          }
           
          System.out.println("\n\nThe winner is " + golfers[minIndex] + ", with " + min + " points!");
      }
   }