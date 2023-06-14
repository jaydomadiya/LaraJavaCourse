class A 
{
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static 
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
}
class Z2
{
	static
	{
		System.out.println("Z2-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main beagin");
		A a1 = new A();
		System.out.println("=============");
		B b1 = new B();
		System.out.println("=============");
		C c1 = new C();
		System.out.println("main end");
	}
}
//any class will be loaded only once for one time execution.if that classes is already available in the memory while in the execution then again that class will not be loading to the memory.
