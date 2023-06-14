package pack1;
class A 
{
	private int i;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}

//access specifiers = access modifiers
//we can have control oover the data,which one should be shared and which one sholud not e over package structure.
//access specifire in java maintains the accessibility or scop of a field,method,constructer,or class or interface
//private || default || proctected || public
//default == package level == friendly
//private members can be access within a classs only 
//the scop of private member is within the declare class.
//private memeber cant accessed outside of the class