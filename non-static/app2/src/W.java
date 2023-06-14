class W
{
	static 
	{
		System.out.println("SIB");
	}
	W()
	{
		
		System.out.println("W(90)");
	}
	
	
	public static void main(String[] args) 
	{
		W W1 = new W();
		System.out.println("========");
		W W2 = new W();
		System.out.println("=========");
	}
}
// static block execute only once while creating loading the class.
// constructor execute every time while creating a object.
