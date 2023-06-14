class XXX

{
	public static void main(String[] args) 
	{
		int i = 0;
		loop1:
		do
		{
			System.out.println("loop1 beagin:" + i);
			int j = 0;
			i++;
			do
			{
				System.out.println("loop 2 beagin: " + j);
				j++;
				if (j > 1)
				{
					break loop1;
				}
				System.out.println("loop 2 end: " + j);
			}
			while (j< 2);
			
			System.out.println("loop1 end:" + i);
		}
		while(i < 3);
	}
}

/*
   loop 1 b 0
   loop2  b 0
   loop2  e 1
   loop2  b 1
	


*/