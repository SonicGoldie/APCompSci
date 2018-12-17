package Projects;
import java.io.*;
public class IntChart2 
{
	public static void main(String[] args) throws IOException {
		Histogram histogram = new Histogram();
		histogram.collect_values();
		histogram.print_results();
	} 
} 
class Histogram {
	final int MAX = 100; 
	final int MIN = 1; 
	int[] numbers = new int[(MAX + 1) / 10];
	public void collect_values() throws IOException {
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader (System.in));
		int number;
		for (int index = 0; index < numbers.length; index++)
			numbers[index] = 0;
		do {
			System.out.print("Enter a number between " + MIN + " and " +
					MAX + " (-1 to quit): ");
			System.out.flush();
			number = Integer.parseInt (stdin.readLine());
			if (number != -1) {
				if (number >= MIN && number <= MAX) {
					numbers[(number-1) / 10]++;
				} else {
					System.out.print("Input ignored. Try again.");
				}
			}
		} while (number != -1);
	} 
	public void print_results() {
		System.out.println();
		for (int index = 0; index < numbers.length; index++) {
			System.out.print (((index*10)+1) + " - " +
					((index+1)*10) + " \t| ");
			for (int index2 = 0; index2 < numbers[index]/5; index2++)
				System.out.print ("*");
			System.out.println();
		}
	} 
}