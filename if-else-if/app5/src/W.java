
class W
{
	public static void main(String[] args) 
	{
		loop1:   
		for (int i = 0; i < 2 ; i++ )
		{
			System.out.println("Outer Loop beagin:i value"+i);
			for(int j=0; j<5; j++)
			{
				System.out.println("Outer Loop beagin:j value"+j);
				if(j>2)
			{
				break loop1;
			}
				System.out.println("Outer Loop beagin:j value"+j);
		}
		System.out.println("Outer Loop beagin:i value"+i);
	}
		System.out.println("main end");
	}
 }

/*
    
	use of label


*/  

