package Projects;

public class UnicodeChart {

	public static void main(String[] args) 
	{
		int count = 0;
		for (int i=0x0020;i<=0x007E;i++)
		{
			if (count < 5)
			{
				//System.out.printf("0x%x : %c\n",i,(char)i);
				System.out.print( i + ": " + (char)i + " ");
				count++;
			}
			else
			{
				System.out.println("");
				count = 0;
				i--;
			}
		}
	}

}
