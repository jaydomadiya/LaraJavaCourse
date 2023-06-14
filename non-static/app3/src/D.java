class D 
{
	D()
	{
		System.out.println("C()");
	}
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args) 
	{
		D c1 = new D();
		System.out.println("=========");
		D c2 = new D();
		System.out.println("======");
	}
}
