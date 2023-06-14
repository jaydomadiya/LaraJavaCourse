class F 
{
	static int count;
	F()
	{
		count++;
	}
	F(int i)
	{
		count++;
	}
	F(int i,int j)
	{
		count++;
	}
	//commen code that we suppose to keep in every constucter body
	{
		count++;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		F f2 = new F(10);
		F f3 = new F(10,20);
		F f4 = new F(20);
		F f5 = new F();
		System.out.println(count);
	}
}
