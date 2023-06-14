class N1

{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println(" loop beagin");
			int  j = 0;
			if(j<5)
			{
				j++;
				System.out.println("loop2 end");
				if(j > 1)
				{
					continue;
				}
				
			}
			
			System.out.println("loop2 end");
		}
		System.out.println("loop1 end");
		i++;
		
	}
}
