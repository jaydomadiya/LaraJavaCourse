class A
{
	static
	{
		System.out.println("A-IIB)");
    }
} 
class B extends A
{
	static
	{
		System.out.println("B-IIB)");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-IIB)");
	}
}
class ZZ1
{
	static
	{
		System.out.println("Z1-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main beagib!");
		A a1 = new A();
		System.out.println("main end");
	}
}
