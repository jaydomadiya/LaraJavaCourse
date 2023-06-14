class S
{
	public static void main(String[] args) 
	{
		System.out.println("main end");
		System.out.println(test());
		System.out.println("main end");
	}
	static void test()
	{
		System.out.println("from test");
		return ;
	}
}
