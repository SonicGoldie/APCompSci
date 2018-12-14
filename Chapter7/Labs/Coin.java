package Labs;

public class Coin 
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	public Coin()
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
	private double bias(double input)
	{
		double bias = 0.5;
		return bias;
	}
}
