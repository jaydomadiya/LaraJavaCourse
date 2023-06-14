class K 
{
	K( )
	{
		System.out.println("K()");
	}
	{
		System.out.println("K-IIB1");
	}
	K(int i)
	{
		this();
		System.out.println("K(int)");
	}
	static
	{
		System.out.println("SIB1");
	}
	
	K(int i, int j)
	{
		this(j);
		System.out.println("K(int,int)");
	}
	static 
	{
		System.out.println("SIB2");
	}
	{
		System.out.println("K-IIB2");
	}
	public static void main(String[] args) 
	{
		K obj1 = new K();
		System.out.println("--------------");
		K obj2 = new K(100);
		System.out.println("--------------");
		K obj3 = new K(100,200);
		System.out.println("--------------");
	}
}