class I
{
	static 
	{
		System.out.println(i); //direct refrence
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
I.java:5: error: illegal forward reference
                System.out.println(i);
                                   ^
1 error
*/

// note only static block get error