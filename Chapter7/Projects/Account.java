package Projects;

import java.text.NumberFormat;

public class Account 
{
	private final double RATE = 0.035;
	
	private long acctnumber;
	private double balance;
	private String name;
	
	public Account(String owner, long account, double initial)
	{
		name = owner;
		acctnumber = account;
		balance = initial;
	}
	
	public double deposit(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount, double fee)
	{
		balance = balance - amount - fee;
		return balance;
	}
	public double addInterest()
	{
		balance += (balance * RATE);
		return balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctnumber + "\t" + name + "\t" + fmt.format(balance);
	}
}
