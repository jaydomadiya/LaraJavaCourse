class D 
{
	int i;
	int j = 20;
	D()
	{
		System.out.println("D()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("=========================");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}

// non satic member can be used starigt away in the non satatic contex without a refrence variable.
