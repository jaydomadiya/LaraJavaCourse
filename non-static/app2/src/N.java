class N extends object
{
	N()
	{
		 super();
		System.out.println("N()");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("===========");
		N n2 = new N();
		System.out.println("============");

	}
}
