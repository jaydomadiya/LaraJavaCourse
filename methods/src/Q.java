class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main end");
		test();
			System.out.println("main end");
	}
	static double test()
	{
		System.out.println("from test");
		return 10;
	}
}



// byte < short < int < float < double
// char and boolean