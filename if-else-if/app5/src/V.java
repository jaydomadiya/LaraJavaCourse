class V
{
	public static void main(String[] args) 
	{
		loop1:   // label //valid identifier
		for (int i = 0; i < 2 ; i++ )
		{
			System.out.println("Loop1 beagin");
			for(int j=0; j<=3; j++)
			{
				System.out.println("loop2 beagin");
				if(j>2)
			{
				continue loop1;
			}
				System.out.println("loop2 end");
		}
		System.out.println("loop1 end");
	}
		System.out.println("main end");
	}
 }

/*
    
	use of label


*/  

