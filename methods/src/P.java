class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main end");
		test();
			System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return true;
	}
}
