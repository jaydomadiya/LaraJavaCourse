class B 
{
	void test()
	{
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("done!");
	}
}

/*
B.java:8: error: non-static method test() cannot be referenced from a static context
                test();
                ^
1 error
*/