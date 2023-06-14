class BankAccount
{
	private double balance;
	

	public double getBalance()
	{
		return balance;
	}
	public void deposite(double amount)
	{
		// implement logic
	}

	public void withdraw(double amount)
	{
		//logic
	}
	class BankDetail
	{
		public static void main(String[] args)
	{
		BankDetail account = new BankDetail();
		account.deposite(1000);
		double balance = account.getBalance();
		System.out.println("Balance " + balance);
	
	}
  }
}