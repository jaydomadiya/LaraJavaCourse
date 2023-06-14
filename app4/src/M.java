class M 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++;                                   // j value 0
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------------");
		int m = 0;
		//int n = m++;
		 m = m++;
		System.out.println(m);
	}
}
