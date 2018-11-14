package Projects;

import java.text.NumberFormat;

public class AccountChapter5 
{
	private final double RATE = 0.035;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	public AccountChapter5(String owner, long account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	public double deposit(double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
			
		}
		else
			System.out.println("ERROR: Please Enter a Positive Number");
		return balance;
	}
	public double withdraw(double amount, double fee)
	{
		if (amount > balance)
		{
			balance = balance - amount - fee;
		}
		else
			System.out.println("ERROR: You cannot take out more money than you own!");
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
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}
