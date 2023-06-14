class H 
{
	void test()
	{
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
		System.out.println("done!");
	}
}

// non staic method test is loading to the memory whenever we are creating an object to the H class.
// by using H class refrence h1 we can access test method which is non static