class M
{
	static int i = test1();
	static int j = test2();
	static
	{
		System.out.println("SIN beagin:" + i + "," +j);
		main(null);
		System.out.println("SIB end" + i+ "," +j);
		i += 1;
		j += 1;
	}
	static int test1()
	{
		System.out.println("test1 beagin" + i + "," + j);
		main(null);
		System.out.println("test1 END" + i + "," + j);
		i += j + 2;
		j += i + 1;
		return i + j + test2();
	}
	static int test2()
	{
		System.out.println("test2 beagin" + i + "," + j);
		i += j + 5;
		j += i + 4;
		main(null);
		System.out.println("test2 beagin" + i + "," + j);
		i += j + 4;
		j += i + 5;
		return i + j + 10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main" + i + "," +j);
		i += j + i;
		j += i + j;

	}
}
