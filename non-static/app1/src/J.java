class J 
{
	void test1()// non static
	{
		System.out.println("frm test 1");
	}
	static void test2()
	{
		J obj = new J();// static
		obj.test1()// by using obj refrence we are accessing non static test1()
		System.out.println("frm2");
	}

}

// non static test 1 method is loading while creating object 
to j class in the test2 static method