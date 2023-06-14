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
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		this();
		System.out.println("C(Int)");
	}
	{
		System.out.println("C(IIB1)");
	}
	{
		System.out.println("C(IIB2)");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("===================");
		B b1 = new B();
		System.out.println("====================");
		A a2 = new A(12);
		System.out.println("====================");
		B b2 = new B(14);
		System.out.println("====================");
		C c1 = new C();
		System.out.println("===================");
		C c2 = new C(23);
		System.out.println("====================");
	}
}
