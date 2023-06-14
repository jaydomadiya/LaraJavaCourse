class  B1
{
	public static void main(String[] args) 
	{
		int i= 1;
		i = (i++ == 1 && i++ == 2) ? 10 :20;
		// i = (i++ == 0 && i++ == 2) ? 10 :20;
		System.out.println(i);
		
	}
}