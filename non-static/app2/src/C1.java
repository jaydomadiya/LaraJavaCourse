class C1
{
	int i = 100;
	C1()
	{
		System.out.println("C()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		C1 c1 = new C1();
		System.out.println("=================");
		System.out.println(c1.i);

	}
}
