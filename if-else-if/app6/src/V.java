class V
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.println("loop1 beagin:" + i);
			int j =0;
			do
			{
				System.out.println("loop 2 beagin: " + j);
				j++;
				System.out.println("loop 2 end: " + j);
			}
			while (j< 2);
			i++;
			System.out.println("loop1 end:" + i);
		}
		while(i < 3);
	}
}

/*
 
*/