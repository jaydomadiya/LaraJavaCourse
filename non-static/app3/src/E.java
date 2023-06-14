class E 
{
	{
		System.out.println("E-IIB1");
	}
	E(int i)
	{
		System.out.println("E(int)");
	}
	public static void main(String[] args) 
	{
		E e1 = new E(12);
		System.out.println("============!");
		E e2 = new E(21);
		System.out.println("============");
	}
		{
		System.out.println("E-IIB2");
	}
}
