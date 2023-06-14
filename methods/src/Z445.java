class Z445
{
	public static void main(String[] args) 
	{
		System.out.println("main beagin");
		int i = 1;
		int j = test(++i);
		System.out.println("main end:" + i + "," +j);
	}
	public static int test(int i)
	{
		System.out.println("from test1:" + i);
		System.out.println("from test:" + i++);
		System.out.println("from test end :" + ++i);
		System.out.println("from test end :" + ++i + i);
		return i++;
	}
}
