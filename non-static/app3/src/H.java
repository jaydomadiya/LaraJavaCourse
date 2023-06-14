class H
{
	H(int i)
	{
		System.out.println("H(int)");
	}
	
	{
		System.out.println("IIB1");
	}
	H()
	{
		this(90);
		System.out.println("G(F)");
	}
	
	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args)
	{
		H g1 = new H();
		System.out.println("============");
		H g2 = new H(12);
		System.out.println("==============");
	}
}