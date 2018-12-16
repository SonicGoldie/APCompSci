package Projects;

public class Bottles {

	public static void main(String[] args) 
	{
		String word = "bottles";
		for (int bottles = 100; bottles > 0;) {
		System.out.println( bottles + " " + word + " of beer on the wall, " + bottles + " " + word + " of beer.");
		bottles = bottles - 1;
		if (bottles == 1) word = "bottle";
		if (bottles == 0)
		System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
		else 
		System.out.println("Take one down and pass it around, " + bottles + " " + word + " of beer on the wall.\n");
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.\n");

	}
	}


