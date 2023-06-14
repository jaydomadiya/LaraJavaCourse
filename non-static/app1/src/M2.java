class M2 
{
	// IIB BLOCK (INSTATNCE INITIALIZETION BLOCK)
	// THIS WILL BE EXECUTE WHILE OBJECTS ARE CREATED BEFORE THE EXECUTION OF COUNSTRUCTER.
	//NON-STATIC BLOCK
	{
		System.out println(i);
	}
	int i;
	public static void main(String[] args) 
	{
		M2 m2 = new M2();
		
	}
}

// illegal forwad refrence applies to non-static also.