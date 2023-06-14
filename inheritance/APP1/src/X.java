class  A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(Int)");
	}
	{
		System.out.println("A(IIB)");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		System.out.println("B(Int)");
	}
	{
		System.out.println("B(IIB1)");
	}
	{
		System.out.println("B(IIB2)");
	}
}
class X
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("===================");
		A a2 = new A();
		System.out.println("====================");
		B b1 = new B();
		System.out.println("====================");
		B b2 = new B();
		System.out.println("====================");
		A a3 = new A(11);
		System.out.println("===================");
		A a4 = new A(14);
		System.out.println("====================");
		B b3 = new B(13);
		System.out.println("====================");
		B b4 = new B(12);
		System.out.println("====================");
	}
}
