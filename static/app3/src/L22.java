class L22
{
	static int test()
	{
		return j ;
	}
	static int i = test();
	static int j = 10;
    static int test()
	{
		return i = 90;
	}    
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j);
	}
}

/*
L22.java:9: error: method test() is already defined in class L22
    static int test()
               ^
1 error

*/