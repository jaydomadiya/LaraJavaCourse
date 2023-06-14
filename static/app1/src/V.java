class V
{
	static int i;
	public static void main(String[] args) 
	{
		
		System.out.println("main!" + i);
		i = 1;
		test();
		System.out.println("main!" + i);
		i = 2;
		V.test();
			System.out.println("main!3" + i);
	}
	public static void test()
	{
		System.out.println("test:" + i);
		i += 3;
	}
}
