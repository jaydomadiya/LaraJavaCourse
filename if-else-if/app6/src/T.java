class T
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.println("beagin" + i);
			i++;
			if (i > 3)
			{
				continue;
			}
			System.out.println("end" + i);
		}
		while(i < 10);
	//	System.out.println("main beagin");
	}
}

