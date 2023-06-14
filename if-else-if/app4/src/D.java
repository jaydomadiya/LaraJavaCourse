class D
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if");
		}
		System.out.println("abc");
		else
		{
			System.out.println("from else");
		}
		System.out.println("main end");
	}
}


/*

D.java:10: error: 'else' without 'if'
                else

*/
