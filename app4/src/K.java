class K 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i++ + i + ++i + i + ++i + i + i++ + i + i++ + i + i-- + i  + i++ + i + i--  + i + --i + i + --i + i + ++i +i; 
		//       0    1    1    2    3     3   4    4    4    5   5     6    6     5    5    6    6      5   4     4   3    3   4    4   
		System.out.println(i);//4
		System.out.println(j);//93
	}
}
