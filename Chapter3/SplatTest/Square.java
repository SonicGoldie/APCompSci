package SplatTest;
import java.awt.*;
public class Square 
{
	private int diameter, x, y;
	private Color color;
	
	public  Square(int size, Color shade, int upperX, int upperY)
	{
		diameter = size;
		color = shade;
		x = upperX;
		y = upperY;
	}
	
	public void draw(Graphics page)
	{
		page.setColor(color);
		page.fillRect(x, y, diameter, diameter);
	}
	public void setDiameter(int size)
	{
		diameter = size;
	}
	public void setColor(Color shade)
	{
		color = shade;
	}
	public void setX(int upperX)
	{
		x = upperX;
	}
	public void setY(int upperY)
	{
		y = upperY;
	}
	public int getDiameter()
	{
		return diameter;
	}
	public Color getColor()
	{
		return color;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}
