class K
	{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if ");
		}
		 else if(false)
		{
			System.out.println("from else if ");
		}
		else 
		{
			System.out.println("from last else if");
		}
		else if(false)
		{
			System.out.println("from last else if 2");	
		}
	}
}

/*

K.java:17: error: 'else' without 'if'
                else if(false)
*/

