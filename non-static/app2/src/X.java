class  X
{
	static
	{
		System.out.println("SIB!");
	}
	static 
	{
		System.out.println("SIB@");
	}
	X()
	{
		System.out.println("X()");
	}
	X(int i)
	{
		this();
		System.out.println("int i");
	}
	public static void main(String[] args) 
	{
		X X1 = new X();
		System.out.println("==========");
		X x2 = new X(12);
		System.out.println("==========");
	}
}
