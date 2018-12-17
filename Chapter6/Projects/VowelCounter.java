package Projects; 
import java.util.Scanner;
public class VowelCounter{


	public static void main(String args []){

		int a =0, e = 0, x = 0;
		int u = 0, o = 0, other = 0;
		String text;
		Scanner scan = new Scanner(System.in);


		System.out.print("enter string: ");
		text = scan.nextLine();

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (c=='a')
				a++; 

			else if( c=='e')
				e++;

			else if(c=='i')
				x++;

			else if(c=='o')
				o++;

			else if (c=='u')
				u++;        

			else
				other++;
		}

		System.out.println("a: " + a + "\n" +
				"e: " + e + "\n" +
				"i: " + x + "\n" +
				"o: " + o + "\n" +
				"u: " + u + "\n" +
				"other: " + other);

	}
}