package Projects;
//*******************************************************************
//
// Numbers4.java Programming Project Application
//
// Authors: Lewis and Loftus
//
// Classes: Numbers4
// Histogram
//
//*******************************************************************
import java.io.*;
//-------------------------------------------------------------------
//
// Class Histogram
//
// Methods:
//
// public static void main(String[] args)
//
//-------------------------------------------------------------------
public class Test {
	//============================================================
	// Collect grades and print their occurrences.
	//============================================================
	public static void main(String[] args) throws IOException {
		Histogram histogram = new Histogram();
		histogram.collect_values();
		histogram.print_results();
	} // method main
} // class Numbers4
//-------------------------------------------------------------------
//
// Class Histogram
//
// Methods:
//
// public void collect_values()
// public void print_results()
//
//-------------------------------------------------------------------
class Histogram {
	final int MAX = 100; // represent 50 different numbers
	final int MIN = 1; // represent 50 different numbers
	int[] numbers = new int[(MAX + 1) / 10];
	//============================================================
	// Collect the data and count the occurrences.
	//============================================================
	public void collect_values() throws IOException {
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader (System.in));
		int number;
		for (int index = 0; index < numbers.length; index++)
			numbers[index] = 0;
		do {
			// Prompt user for a grade and store the user's choice
			System.out.print("Enter a number between " + MIN + " and " +
					MAX + " (-1 to quit): ");
			System.out.flush();
			number = Integer.parseInt (stdin.readLine());
			// Validate input and record frequency
			if (number != -1) {
				if (number >= MIN && number <= MAX) {
					numbers[(number-1) / 10]++;
				} else {
					System.out.print("Input ignored. Try again.");
				}
			}
		} while (number != -1);
	} // method collect_values
	// ============================================================
	// Prints the results of the data collection. Only non-zero
	// results are printed.
	// ============================================================
	public void print_results() {
		System.out.println();
		for (int index = 0; index < numbers.length; index++) {
			System.out.print (((index*10)+1) + " - " +
					((index+1)*10) + " \t| ");
			for (int index2 = 0; index2 < numbers[index]/5; index2++)
				System.out.print ("*");
			System.out.println();
		}
	} // method print_results
} // class Histogram