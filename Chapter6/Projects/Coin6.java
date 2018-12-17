package Projects;

public class Coin6 
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	public Coin6()
	{
		flip();
	}
	void flip() 
	{
		face = (int) (Math.random() *2);
	}
		
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
}
