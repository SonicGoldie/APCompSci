package Projects;

public class Transactions {

	public static void main(String[] args) 
	{
		Account acct1 = new Account("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account("Jane Smith", 69713, 40.00);
		Account acct3 = new Account("Edward Demsey", 93757, 759.32);
		
		acct1.deposit(25.85);
	}

}
