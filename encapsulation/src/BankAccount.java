class BankAccount
{
	private double balance ;
	//private double deposite;
	//private double withdraw;
	

	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double amount)
	{
		this.balance += balance;
	}
	public void setDeposite(double amount)
	{
		this.balance -= amount;
	}
	public void setWithdraw(double amount)
	{
		this.balance += amount;
	}
}
	class BankDetail
	{
		public static void main(String[] args)
	{
		BankAccount account = new BankAccount();
		System.out.println("Balance initial  " + account.getBalance());
		account.setDeposite(1000);
		System.out.println("Balance after deposite  " + account.getBalance());
		account.setWithdraw(500);
		System.out.println("Balance after Withdraw  " + account.getBalance());
		
	}
  }