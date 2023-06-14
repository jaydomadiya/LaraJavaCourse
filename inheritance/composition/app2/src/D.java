class A 
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D
{
	A obj; //= new A();
	void test2()
	{
		System.out.println("C-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		//System.out.println(c1.obj);
		d1.test2();
	}
}
//we can cant able to call anything on the null refrence.f we call we get NullPointerException
