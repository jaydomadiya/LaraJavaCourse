class U 
{
	U()
	{
		this(10);
		System.out.println("u(90)");
	}
	U(int i)
	{
		this();
		System.out.println("U(INT I )");
	}
	public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("Hello World!");
		U u2 = new U(12);
		System.out.println("Hello World!");
	}
}
