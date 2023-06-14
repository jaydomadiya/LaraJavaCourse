class E 
{
	static int i;
}
class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}


//static vatriable are also inhriting to the sub class from the superclass.

// - by using sub class refrence only we can access static member of subclass. no need of creating object.

// - even by creating object to subclass also we can access static variable.
