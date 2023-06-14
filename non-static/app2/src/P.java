class P 
{
	P()
	{
		this(10,20);
		System.out.println("P()");
	}
	P(int i,int j)
	{
		System.out.println("P(int i, int j");
	}
	public static void main(String[] args) 
	{
		P P1 = new P();
		System.out.println("=============");
		P P2 = new P(1,2);
		System.out.println("=============");
	}
}
