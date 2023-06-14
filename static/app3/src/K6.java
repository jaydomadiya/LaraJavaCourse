class K6
{
	static
	{
		System.out.println(K6.i);
		i = 100;
	}
	static int j = test();
	static int test()
	{
		return ++i ;
	}
	static int i;
	
	public static void main(String[] args) 
	{
		System.out.println("done:"  + i);
		System.out.println("done:"  + j);
		System.out.println("done:"  + test());
		System.out.println("done:"  + j);
		System.out.println("done:"  + i);
	}
}