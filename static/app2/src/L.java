class L 
{
	static int i= test();

	public static int test()
	{
		System.out.println("test beagin" + i);
		i = 1;
		main(null);
		System.out.println("test end" + i);
		i = 2;
		return 1 + 2;
	} 
	     public static void main(String[] args)
	{
		System.out.println("main"+i);
		i += 5;
	}
	static
	{
		System.out.println("SIB1 beagin:" + i);
		i = 3;
		main(null);
		System.out.println("SIB2 beagin:" + i);
	}
}
