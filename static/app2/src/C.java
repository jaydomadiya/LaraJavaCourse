class C
{
	static int i=  10;
	static int j = 10;

	static 
	{
		System.out.println("SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println(i + "," + j);
	}
}
/*
// SIB :- STATIC INTIAIZATION BLOCK
          BEFOR THE MAIN METHOD OUTER OF MAIN METHOD 
		  NOT INSIDE METHOD
		  
		  SIB IS BLOCK NOT A METHOD
*/