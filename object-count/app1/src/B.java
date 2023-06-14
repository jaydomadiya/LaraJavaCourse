class B 
{
	static int p = 10;
	public static void main(String[] args) 
	{
		System.out.println("a:" + p);
		System.out.println("b:" + B.p);
		B obj = new B();
		// compiler replacing from refrence variable to class name
		// can use refrence of same class
		System.out.println("C" + obj.p);
	}
}

//all the static member of a class will be shared by each end every object of that class.
//by using any refrencw of any object we can ac	cess any static member.
//by using NY REFRENCE OF ANY OBJEECT WE CAN ABLE TO ACCESS OR MODIFY THE STATIC MEMBER.
//only the orignal static member will be getting modify .becuse static member gets loaded only once not  again and again.